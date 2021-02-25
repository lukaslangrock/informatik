package RPG;

public class Krieger extends Held {
    private int ausdauer;

    public Krieger(String pName, int pStaerke, int pLebenspunkte, int pAusdauer) {
        super(pName, pStaerke, pLebenspunkte);
        ausdauer = pAusdauer;
    }

    public int getAngriffswert() {
        return super.getAngriffswert() + ausdauer;
    }
}
