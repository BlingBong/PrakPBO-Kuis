import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactsManager myContactManager = new ContactsManager();

        myContactManager.addContact(new Contact("Joy", "hahaha@yahoo.com", "081234567890"));
        myContactManager.addContact(new Contact("Sadness", "huhuhu@gmail.com", "0800-0000-0000"));
        myContactManager.addContact(new Contact("Fear", "hohoho@me.com", "+6281342066604"));
        myContactManager.addContact(new Contact("Anger", "hehehe@hotmail.com", "(0274) 60123"));
        myContactManager.addContact(new Contact("Disgust", "hihihi@icloud.com", "080 808 080 808"));

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Search Name: ");
            String cariNama = input.next();
            System.out.println("\nLooking for " + cariNama + "'s contact . . .\n");

            Contact search = myContactManager.searchContact(cariNama);

            if(search == null){
                System.out.println("Contact not found!");
            }

            else {
                System.out.println("Name            : " + search.getName());
                System.out.println("Phone Number    : " + search.getPhoneNumber());
                System.out.println("Email           : " + search.getEmail());
            }

            System.out.print("\nAgain? (y/n): ");
            String loop = input.next();
            if(!loop.equalsIgnoreCase("y")){
                return;
            }
            System.out.println();
        }
        while(true);
    }
}
