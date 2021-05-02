package useradministration;

import lib.ComparableContent;

public class Benutzerprofil implements ComparableContent<Benutzerprofil> {
    private String username, pwInCleartextYesItsVeryVerySecurePleaseDontHackThankYou;

    public Benutzerprofil(String login, String pw) {
        username = login;
        pwInCleartextYesItsVeryVerySecurePleaseDontHackThankYou = pw;
    }

    public String getBenutzername() {
        return username;
    }

    public boolean validatePw(String pw) {
        return (pwInCleartextYesItsVeryVerySecurePleaseDontHackThankYou.equals(pw));
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