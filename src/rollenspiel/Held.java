package RPG;

public class Held extends Spielecharakter {
    private Waffe waffe;
    private int staerke;

    public Held(String pName, int pStaerke, int pLebenspunkte) {
        super.setName(pName);
        super.setLebenspunkte(pLebenspunkte);
        staerke = pStaerke;
    }

    public void angreifen(Spielecharakter pSpielecharakter, Kampfregel pKampfregel) {
        pKampfregel.kampf(this, pSpielecharakter);
    }

    public int getAngriffswert() {

        if (waffe == null)
            return super.getAngriffswert() * staerke;
        else
            return super.getAngriffswert() * staerke + waffe.getAngriffswert();
    }
}