package useradministration;

import lib.BinarySearchtree;

public class Benutzerverwaltung {
    BinarySearchTree<Benutzerprofil> userDB;

    public Benutzerverwaltung() {
        userDB = new BinarySearchTree<Benutzerprofil>();
    }

    public void newUser(String pUsername, String pPassword) {
        userDB.insert(new Benutzerprofil(pUsername, pPassword));
    }

    public void delUser(String pUsername, String pPassword) {
        userDB.remove(new Benutzerprofil(pUsername, pPassword));
    }

    public boolean checkUser(String pUsername) {
        return (userDB.search(new Benutzerprofil(pUsername, null)) != null);
    }
}
