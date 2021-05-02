package useradministration;

import lib.ComparableContent;

public class Benutzerprofil implements ComparableContent<Benutzerprofil> {
    private String username, password;

    public Benutzerprofil(String login, String pw) {
        username = login;
        pwInCleartextYesItsVeryVerySecurePleaseDontHackThankYou = pw;
    }

    public String getUsername() {
        return username;
    }

    public boolean validatePw(String pPassword) {
        return (password.equals(pPassword));
    }

    @override
    public boolean isGreater(Benutzerprofil pProfile) {
        return this.getBenutzername().compareTo(pProfile.getBenutzername()) > 0;
    }

    @override
    public boolean isLess(Benutzerprofil pProfile) {
        return this.getBenutzername().compareTo(pProfile.getBenutzername()) < 0;
    }

    @override
    public boolean isEqual(Benutzerprofil pProfile) {
        return this.getBenutzername().compareTo(pProfile.getBenutzername()) == 0;
    }
}