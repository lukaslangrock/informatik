package rollenspiel;

public class Monster extends Spielecharakter {
    public Monster(int pAngriffswert, int pLebenspunkte) {
        super.setAngriffswert(pAngriffswert);
        super.setLebenspunkte(pLebenspunkte);
    }

    public void angreifen(Spielecharakter pSpielecharakter, Kampfregel pKampfregel){
        pKampfregel.kampf(this, pSpielecharakter);
    }
}