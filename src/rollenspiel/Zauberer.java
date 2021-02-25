package RPG;

public class Zauberer extends Held {
    private int zauberkraft;

    public Zauberer(String pName, int pStaerke, int pLebenspunkte, int pZauberkraft) {
        super(pName, pStaerke, pLebenspunkte);
        zauberkraft = pZauberkraft;
    }

    public void heilen() {
        super.setLebenspunkte(super.getLebenspunkte() + zauberkraft);
    }

    // Simple Getters
    public int getZauberkraft(){ return zauberkraft; }

    //Simple Setters
    public void setZauberkraft(int pZauberkraft){ zauberkraft = pZauberkraft; }
}