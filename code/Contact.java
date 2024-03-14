public class Contact {
    //contact's attributes
    private String name;
    private String email;
    private String phone_number;

    //constructor for a contact
    //a contact has to be created using name, email and phone_number that user inputs
    public Contact(String name, String email, String phone_number) {
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
    }

    //getters
    public String getName() { //get the contact's name
        return this.name;
    }
    public String getEmail() { //get the contact's email
        return this.email;
    }
    public String getPhoneNumber() { //get the contact's phone number
        return this.phone_number;
    }

    //setters
    public void setName(String name) { //set the contact's name
        this.name = name;
    }
    public void setEmail(String email) { //set the contact's email
        this.email = email;
    }
    public void setPhoneNumber(String phone_number) { //set the contact's phone number
        this.phone_number = phone_number;
    }

    //print contact's information from name, email, to phone number
    public void printContact(){
        System.out.println("Contact name: " + this.name + " | email: " + this.email + 
        " | phone_number: " + this.phone_number);
    }

}
