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

    public boolean delUser(String pUsername, String pPassword) {
        if (checkUser(pUsername, pPassword)) {
            userDB.remove(new Userprofile(pUsername, null));
            return true;
        }
        return false;
    }

    public boolean checkUser(String pUsername) {
        return (userDB.search(new Userprofile(pUsername, null)) != null);
    }

    public boolean checkUser(String pUsername, String pPassword) {
        Userprofile user = userDB.search(new Userprofile(pUsername, null));
        if (user == null) { return false; }
        return user.validatePw(pPassword);
    }
}
