package useradministration;

import lib.BinarySearchTree;

public class Usermanager {
    BinarySearchTree<Userprofile> userDB;

    public Usermanager() {
        userDB = new BinarySearchTree<Userprofile>();
    }

    public void newUser(String pUsername, String pPassword) {
        userDB.insert(new Userprofile(pUsername, pPassword));
    }

    public void delUser(String pUsername, String pPassword) {
        userDB.remove(new Userprofile(pUsername, pPassword));
    }

    public boolean checkUser(String pUsername) {
        return (userDB.search(new Userprofile(pUsername, null)) != null);
    }
}
