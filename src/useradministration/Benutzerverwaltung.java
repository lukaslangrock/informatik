package useradministration;

import lib.BinarySearchtree;

public class Benutzerverwaltung {
    BinarySearchTree<Benutzerprofil> userDB;

    public Benutzerverwaltung() {
        userDB = new BinarySearchTree<Benutzerprofil>();
    }

    public void newUser(String pUsername, String pPwassword) {
        // todo
    }

    public void delUser(String pUsername, String pPassword) {
        // todo
    }

    public boolean checkUser(String pUsername) {
        //todo
    }
}
