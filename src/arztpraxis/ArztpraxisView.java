package arztpraxis;

/**
 * <p>Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule, Materialien zum schulinternen Lehrplan Informatik SII</p>
 * *
 * @version 2014-03-13
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Georg Dick
 * 
 */
public class ArztpraxisView extends JFrame {

    private JPanel contentPane;
    private JTextField tName;
    private JTextField tKasse;
    private JTextField tNaechster;
    private JButton btnZurBehandlungRufen;
    private JButton btnPatientAnmelden; 
    private JTextField tMessung;
    private JButton btnMessung;

    private ArztpraxisController kenntArztpraxisController;
    private JTextField tSprechzimmer;

    public ArztpraxisView() {
        setTitle("Arztpraxis V2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 616, 352);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(23, 32, 56, 16);
        contentPane.add(lblName);

        tName = new JTextField();
        tName.setBounds(71, 29, 116, 22);
        contentPane.add(tName);
        tName.setColumns(10);

        JLabel lblKasse = new JLabel("Kasse");
        lblKasse.setBounds(232, 32, 56, 16);
        contentPane.add(lblKasse);

        tKasse = new JTextField();
        tKasse.setBounds(276, 29, 116, 22);
        contentPane.add(tKasse);
        tKasse.setColumns(10);

        btnPatientAnmelden = new JButton("Patient nur zur Sprechstunde anmelden");
        btnPatientAnmelden.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    if (!(tName.getText().equals("") || tKasse.getText().equals(""))){
                        kenntArztpraxisController.bearbeiteAnmeldungSprechzimmer(tName.getText(), tKasse.getText());
                        tName.setText("");
                        tKasse.setText("");
                    } else {
                        JOptionPane.showMessageDialog(ArztpraxisView.this, "Bitte Namen und Kasse angeben");
                    }
                }
            });
        btnPatientAnmelden.setBounds(23, 76, 369, 25);
        contentPane.add(btnPatientAnmelden);

        JLabel lblNchsterPatient = new JLabel("nächster Patient für die Sprechstunde");
        lblNchsterPatient.setBounds(23, 163, 369, 16);
        contentPane.add(lblNchsterPatient);

        tNaechster = new JTextField();
        tNaechster.setEditable(false);
        tNaechster.setBounds(23, 192, 182, 22);
        contentPane.add(tNaechster);
        tNaechster.setColumns(10);

        btnZurBehandlungRufen = new JButton("Zur Behandlung rufen");
        btnZurBehandlungRufen.setEnabled(false);
        btnZurBehandlungRufen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {       
                    kenntArztpraxisController.bearbeiteNaechsterPatient();        
                }
            });
        btnZurBehandlungRufen.setBounds(232, 191, 160, 25);
        contentPane.add(btnZurBehandlungRufen);

        JButton btnPatientZuSprechstunde = new JButton("Patient zu Sprechstunde und Blutdruckmessung anmelden");
        btnPatientZuSprechstunde.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    if (!(tName.getText().equals("") || tKasse.getText().equals(""))){
                        kenntArztpraxisController.bearbeiteAnmeldungSprechzimmerUndBlutdruckmessung(tName.getText(), tKasse.getText());
                        tName.setText("");
                        tKasse.setText("");
                    } else {
                        JOptionPane.showMessageDialog(ArztpraxisView.this, "Bitte Namen und Kasse angeben");
                    }
                }
            });
        btnPatientZuSprechstunde.setBounds(23, 116, 369, 23);
        contentPane.add(btnPatientZuSprechstunde);

        JLabel lblNchsterPatientFr = new JLabel("nächster Patient für die Blutdruckmessung");
        lblNchsterPatientFr.setBounds(23, 240, 369, 14);
        contentPane.add(lblNchsterPatientFr);

        tMessung = new JTextField();
        tMessung.setEditable(false);
        tMessung.setBounds(23, 274, 182, 20);
        contentPane.add(tMessung);
        tMessung.setColumns(10);

        btnMessung = new JButton("Zur Messung rufen");
        btnMessung.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {        
                    kenntArztpraxisController.bearbeiteNaechsteMessung();       
                }
            });
        btnMessung.setEnabled(false);
        btnMessung.setBounds(232, 273, 160, 23);
        contentPane.add(btnMessung);

        tSprechzimmer = new JTextField();
        tSprechzimmer.setEditable(false);
        tSprechzimmer.setBounds(415, 193, 160, 20);
        contentPane.add(tSprechzimmer);
        tSprechzimmer.setColumns(10);

        JLabel lblPatientImSprechzimmer = new JLabel("Patient im Sprechzimmer");
        lblPatientImSprechzimmer.setBounds(415, 164, 160, 14);
        contentPane.add(lblPatientImSprechzimmer);
    }

    public void setzeArztpraxisController(
    ArztpraxisController kenntArztpraxisController) {
        this.kenntArztpraxisController = kenntArztpraxisController;
    }

    public void setzeNaechster(String naechster) {
        if (naechster == null || naechster.equals("")||naechster.equals("-")) {
            tNaechster.setText("-");
            btnZurBehandlungRufen.setEnabled(false);
        } else {
            tNaechster.setText(naechster);
            btnZurBehandlungRufen.setEnabled(true);
        }
    }

    /**
     * @param naechster
     */
    public void setzeNaechsterBD(String naechster) {
        if (naechster == null || naechster.equals("")||naechster.equals("-")) {
            tMessung.setText("-");
            btnMessung.setEnabled(false);
        } else {
            tMessung.setText(naechster);
            btnMessung.setEnabled(true);
        }

    }

    /**
     * @param message
     */
    public void zeigeMeldung(String message) {
        JOptionPane.showMessageDialog(this,message);    
    }

    public void leereSprechzimmer() {
        tSprechzimmer.setText("leer");    
    }

    public void setzeInsSprechzimmer(String pat){
        tSprechzimmer.setText(pat);   
    }
}
