package useradministration;

import lib.ComparableContent;

public class Benutzerprofil implements ComparableContent<Benutzerprofil> {
    private String username, pwInCleartextYesItsVeryVerySecurePleaseDontHackThankYou;

    public Benutzerprofil(String login, String pw) {
        username = login;
        pwInCleartextYesItsVeryVerySecurePleaseDontHackThankYou = pw;
    }

    public String getBenutzername() {
        return benutzername;
    }

    public boolean validatePw(String pw) {
        if (pwInCleartextYesItsVeryVerySecurePleaseDontHackThankYou.equals(pw)) {
            return true;
        } else { return false; }
    }

    @override
    public boolean isGreater(ContentType pContent) {

    }

    @override
    public boolean isGreater(ContentType pContent) {
        
    }

    @override
    public boolean isGreater(ContentType pContent) {
        
    }
}