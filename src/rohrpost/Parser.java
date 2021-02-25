package rohrpost;

import lib.List;

public class Parser {
    /**
     * Checkt ob eine Tokenliste eine valide Syntax hat.
     */
    public boolean check(List<Token> tokenlist) {
        tokenlist.toFirst();
        if (tokenlist.getContent().getBezeichner() != "Beginn") { return false; }
        tokenlist.next();
        if (tokenlist.getContent().getBezeichner() != "Etage") { return false; }
        tokenlist.next();
        if (tokenlist.getContent().getBezeichner() != "Flur") { return false; }
        tokenlist.next(); // check if there are more elements in the tokenlist
        if (tokenlist.hasAccess()) { return false; }

        return true; // All syntactic checks passed
    }
}
