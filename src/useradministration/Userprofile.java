package useradministration;

import lib.ComparableContent;

public class Userprofile implements ComparableContent<Userprofile> {
    private String username, password;

    public Userprofile(String login, String pw) {
        username = login;
        password = pw;
    }

    public String getUsername() {
        return username;
    }

    public boolean validatePw(String pPassword) {
        return (password.equals(pPassword));
    }

    @Override
    public boolean isGreater(Userprofile pProfile) {
        return this.getUsername().compareTo(pProfile.getUsername()) > 0;
    }

    @Override
    public boolean isLess(Userprofile pProfile) {
        return this.getUsername().compareTo(pProfile.getUsername()) < 0;
    }

    @Override
    public boolean isEqual(Userprofile pProfile) {
        return this.getUsername().compareTo(pProfile.getUsername()) == 0;
    }
}