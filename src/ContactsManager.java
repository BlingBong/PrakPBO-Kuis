public class ContactsManager {
    //Fields
    private Contact[] myFriends;
    private int friendsCount;

    //Costructor
    public ContactsManager() {
        this.myFriends = new Contact[500];
        friendsCount = 0;
    }

    public void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount += 1;
    }

    public Contact searchContact(String searchName){
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].getName().equalsIgnoreCase(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}
