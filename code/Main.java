//import java API
import java.util.Scanner;

public class Main {

    public static void display_menus(){
        //display the menu options for the user
        System.out.println("*****************************************");
        System.out.println("(A)dd");
        System.out.println("(D)elete");
        System.out.println("(E)mail search");
        System.out.println("(P)rint list");
        System.out.println("(S)earch");
        System.out.println("(Q)uit");
        System.out.println("****************************************");
    }

    public static void main(String[] args) {
        //continue choice to determine if the users want to continue or quit
        boolean continue_choice = true;
        //contact book which is a linked list
        ContactBook contact_book = new ContactBook();

        //print welcome message
        System.out.println("Welcome to the Contact Book Program.");

        //while user doesn't quit
        while(continue_choice == true){
            //display the menu
            display_menus();

            //prompt user to input their choice of menu
            String menu;
            System.out.print("Please enter a command: ");
            Scanner scan = new Scanner(System.in);
            menu = scan.next();

            //change all the user input to uppercase, because the switch case
            //will be all in uppercase options
            menu = menu.toUpperCase();

            switch (menu) {
                //if user inputs "A", then add a new contact
                case "A":
                    System.out.println("\nAdd a Contact");
                    contact_book.contact_list = contact_book.add_contact();
                    System.out.println("");
                    break;
                
                //if user inputs "D", then delete a contact
                case "D":
                    System.out.println("\nDelete a Contact");
                    contact_book.contact_list = contact_book.delete_contact();
                    System.out.println("");
                    break;

                //if user inputs "E", then search for a contact based on the email
                case "E":
                    System.out.println("\nSearch a Contact based on Email");
                    Contact result = contact_book.email_search();

                    //if the search result is not null, then print the result's information
                    if (result != null) {
                        System.out.println("The result based on your email search is ");
                        result.printContact();
                    }
                    System.out.println("");
                    break;
                
                //if user inputs "P", then print all of the contacts in the contact book
                case "P":
                    System.out.println("\nPrinting List of Contacts");
                    contact_book.print_all_contacts();
                    System.out.println("");
                    break;
                
                //if the user inputs "S", then search for a contact based on the name
                case "S":
                    System.out.println("\nSearch a Contact based on Name");
                    Contact result_search = contact_book.search();

                    // if the search result is not null, then print the result's information
                    if (result_search != null) {
                        System.out.println("The result based on your email search is ");
                        result_search.printContact();
                    }
                    System.out.println("");
                    break;
                
                //if the user inputs "Q", then quit the program
                case "Q":
                    continue_choice = false;
                    scan.close();
                    break;
                
                //if the user inputs other things besides the available case,
                //then print the error message and ask user to input again.
                default:
                    System.out.println("\n"+menu+" is not valid. Please try again.");
                    System.out.println("");
                    break;
                }
        }
        
        //print the thank you message upon quiiting the program
        System.out.println("\nThank you for using this program.");

    }
}

