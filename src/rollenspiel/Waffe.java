package RPG;

public class Waffe {
    private final String material;
    private final int angriffswert = 5; // Grundangriffswert
    private final int bonus;
    private final int magie;

    public Waffe(final int pBonus, final String pMaterial, final int pMagie) {
        bonus = pBonus;
        material = pMaterial;
        magie = pMagie;
    }

    // Simple Getters
    public int getAngriffswert() { return angriffswert * magie + bonus; }
    public String getMaterial() { return material; }
}