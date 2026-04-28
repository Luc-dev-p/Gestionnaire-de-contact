//Initialisation de la liste Contact pour l'ajout et la recherche
public class ContactManager {
    Contact[] myFriends;
    int friendsCount;

    //Initialisation d'un gestionnaire vide pouvant contenir jusqu'à 500 contacts
    ContactManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }
    //Ajout d'un contact au gestionnaire et incrémente le compteur
    public void addContact(Contact unContact){
        myFriends[friendsCount] = unContact;
        friendsCount++;
    }
    //Recherche un contact par un nom
    public Contact searchContact(String unNom) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(unNom)) {
                return myFriends[i];
            }
        }
        return null;
    }
}
