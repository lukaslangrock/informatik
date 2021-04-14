package abfahrtslauf;

import lib.List;

/**
 * Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule,
 * Materialien zum schulinternen Lehrplan Informatik SII
 */
public class Rangliste {
    private List<Laeufer> liste;

    public Rangliste() {
        liste = new List<Laeufer>();
    }

    public void einsortieren(Laeufer abl) {
        if (liste.isEmpty()) {
            liste.insert(abl);
        } else {
            liste.toFirst();

            while (liste.hasAccess() && liste.getContent().zeit() <= abl.zeit()) {
                liste.next();
            }

            if (liste.hasAccess()) {
                liste.insert(abl);
            } else {
                liste.append(abl);
            }
        }
    }

    public String ausgabe() {
        String erg = "";
        liste.toFirst();
        while (liste.hasAccess()) {
            erg += liste.getContent().name() + "\n";
            liste.next();
        }
        return erg;
    }
}