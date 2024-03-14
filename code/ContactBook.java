//import Java API
import java.util.LinkedList;
import java.util.Scanner;

public class ContactBook {
    //contact book consists of contact list which is a linked list 
    public LinkedList<Contact> contact_list = new LinkedList<Contact>(); 
    static Scanner sc = new Scanner(System.in);
    //constructor
    public ContactBook(){}

    public LinkedList<Contact> add_contact (){
        //variable for the input
        String words;

        //prompt user to input the name, email, and phone number
        System.out.print("Enter name, email, and phone number (separated by space, ");
        System.out.print("ex:Ella ella@gmail.com 0895) : ");
        //scanning user input
        words = sc.nextLine();

        //split the string based on space, so that 
        //s[0] is the name, s[1] is email, and s[2] is phone number
        String s[] = words.split(" ");

        //for every contact in the contactbook 
        for (Contact contact : this.contact_list){
            //if contact's name is equal to user's input name, then there will be no 
            //new contact added
            if (contact.getName().equalsIgnoreCase(s[0])){
                System.out.println("Contact already existed. Please try again!");
                return this.contact_list;
            }
        }

        //if contact doesn't exist yet, then create a new contact
        Contact contact_new = new Contact(s[0], s[1], s[2]);
        //append the new contact to the linked list
        this.contact_list.add(contact_new);

        //print information that the new contact is successfully added.
        contact_new.printContact();
        System.out.println("is successfully added!");

        return this.contact_list;
    }

    public LinkedList<Contact> delete_contact (){
        //variable for the user input
        String name;

        //prompt the user to input the desired deleted contact's name
        System.out.print("Enter desired deleted contact's name: ");
        name = sc.nextLine();

        //for every contact in the contact book
        for (Contact contact : this.contact_list){
            //if contact's name is equal to the input's name, then print information 
            //that the contact is successfully deleted and delete the contact
            if (contact.getName().equalsIgnoreCase(name)){
                contact.printContact();
                System.out.println("is successfully deleted!");
                this.contact_list.remove(contact);
                return this.contact_list;
            } 
        }

        //if there is no sunch name in the contact book, then print the error message
        System.out.println("There is no contact with the name of "+name);
        return this.contact_list;
    }

    public Contact email_search (){
        //variable for user input
        String email;

        //prompt user to input email that user wants to search
        System.out.print("Enter desired contact's email: ");
        email = sc.nextLine();

        //check for every contact in the contact book. If there is a contact with
        //the same email as the input email. then return the contact
        for (Contact contact : this.contact_list){
            if (contact.getEmail().equalsIgnoreCase(email)){
                return contact;
            }
        }
        //if not, then print the error message
        System.out.println("There is no contact with the email of "+email);
        return null;
    }

    public void print_all_contacts(){
        if (contact_list.size() == 0){
            System.out.println("Contact book is empty.");
        }else{
            //for every contact in the contact book, print the contact's information
            System.out.println("Below are the contacts in this contact book.");
            for (Contact contact : this.contact_list){
                contact.printContact();
            } 
        }

    }

    public Contact search (){
        //variable for user input
        String name;

        //prompt user to input the name that user wants to search
        System.out.print("Enter desired contact's name: ");
        name = sc.nextLine();

        //for each contact in the contact book, if the name matches the input name
        //then return the contact
        for (Contact contact : this.contact_list){
            if (contact.getName().equalsIgnoreCase(name)){
                return contact;
            }
        }
        //if not, then print the error message
        System.out.println("There is no contact with the name of "+name);
        return null;
    }

    
    
}
