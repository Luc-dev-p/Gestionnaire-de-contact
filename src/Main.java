public class Main {
    public static void main(String[] args) {

        ContactManager myContactsManager = new ContactManager();


        Contact fiche1 = new Contact();
        fiche1.name = "Campbell";
        fiche1.phoneNumber = "+225 0707070707";
        myContactsManager.addContact(fiche1);


        Contact fiche2 = new Contact();
        fiche2.name = "Awa";
        fiche2.phoneNumber = "+225 0101010101";
        myContactsManager.addContact(fiche2); // On l'ajoute


        Contact fiche3 = new Contact();
        fiche3.name = "Kofi";
        fiche3.phoneNumber = "+225 0202020202";
        myContactsManager.addContact(fiche3);

        Contact fiche4 = new Contact();
        fiche4.name = "Yao";
        fiche4.phoneNumber = "+225 0303030303";
        myContactsManager.addContact(fiche4);

        Contact fiche5 = new Contact();
        fiche5.name = "Mariam";
        fiche5.phoneNumber = "+225 0404040404";
        myContactsManager.addContact(fiche5);

        Contact ficheTrouvee;

        ficheTrouvee = myContactsManager.searchContact("Campbell");

        System.out.println("Le numéro est : " + ficheTrouvee.phoneNumber);

    }
}

