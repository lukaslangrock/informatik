package wartezimmer;

/**
 * Qualitaets- und UnterstuetzungsAgentur – Landesinstitut für Schule, Materialien zum schulinternen Lehrplan Informatik SII
 */
import javax.swing.*;

class WartezimmerOberflaeche{
    private JFrame f;
    private JLabel name, kasse, naechster;
    private JTextField eingabeName, eingabeKasse, anzeige ;
    private JButton anmeldung,aufruf;
    private JPanel contentpane;
    private Wartezimmer wartezi;
    private FensterSchliesser fs;

    public WartezimmerOberflaeche(){
        f=new JFrame();
        contentpane=new JPanel();
        f.setContentPane(contentpane);
        wartezi=new Wartezimmer (this);
        name=new JLabel("Name:");
        kasse=new JLabel("Kasse:");
        naechster=new JLabel("Nächster:");
        anmeldung=new JButton("anmelden");
        anmeldung.addActionListener(wartezi);
        eingabeName=new JTextField("",20);
        eingabeKasse=new JTextField("",20);
        aufruf=new JButton("rufen");
        aufruf.addActionListener(wartezi);
        anzeige=new JTextField("",20);
        contentpane.add(name);
        contentpane.add(eingabeName);
        contentpane.add(kasse);
        contentpane.add(eingabeKasse);
        contentpane.add(anmeldung);
        contentpane.add(naechster);
        contentpane.add(anzeige);
        contentpane.add(aufruf);
        fs=new FensterSchliesser();
        f.addWindowListener(fs);
        f.pack();
        f.setVisible(true);
    }

    public void setEingabeName(String s){
        eingabeName.setText(s);
    }

    public void setAnzeige(String s){
        anzeige.setText(s);
    }

    public String getEingabeName(){
        return eingabeName.getText();
    }

    public void setEingabeKasse(String s){
        eingabeKasse.setText(s);
    }

    public String getEingabeKasse(){
        return eingabeKasse.getText();
    }
}
