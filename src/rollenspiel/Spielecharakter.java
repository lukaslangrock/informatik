package rollenspiel;

public abstract class Spielecharakter {
    private String name;
    private int angriffswert = 5; // Grundangriffswert
    private int lebenspunkte = 20; // Grundlebenspunkte
    private boolean istTot = false;

    abstract void angreifen(Spielecharakter pSpielecharakter, Kampfregel pKampfregel);

    // Simple Getters
    public int getAngriffswert() { return angriffswert; }
    public int getLebenspunkte() { return lebenspunkte; }

    public String getName() { return name; }

    public boolean getTot() { return istTot; }

    // Special Setters
    public void setLebenspunkte(int pLebenspunkte) { 
        lebenspunkte = pLebenspunkte;
        if(lebenspunkte <= 0)
            setTot(true);
    }
    public void setAngriffswert(int pAngriffswert) { angriffswert = pAngriffswert;
        if(lebenspunkte <= 0)
            setTot(true);
    }

    // Simple Setters
    public void setTot(boolean pTot) { istTot = pTot; }
    public void setName(String pName) { name = pName; }
}