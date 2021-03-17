package rollenspiel;

public class Kampfregel {
    private final Wuerfel wuerfel;

    public Kampfregel() {
        wuerfel = new Wuerfel(10);
    }

    public void kampf(final Spielecharakter pAngreifer, final Spielecharakter pVerteidiger) {
        final int randomMultiplier = wuerfel.wuerfeln();

        int angreiferLeben = pAngreifer.getLebenspunkte();
        angreiferLeben -= pVerteidiger.getAngriffswert() * randomMultiplier;

        int verteidigerLeben = pVerteidiger.getLebenspunkte();
        verteidigerLeben -= pAngreifer.getAngriffswert() * randomMultiplier;

        pAngreifer.setLebenspunkte(angreiferLeben);
        pVerteidiger.setLebenspunkte(verteidigerLeben);
    }
}
