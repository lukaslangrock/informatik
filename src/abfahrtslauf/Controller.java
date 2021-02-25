package Abfahrtslauf;

/**
 * Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule, Materialien zum schulinternen Lehrplan Informatik SII
*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Controller implements ActionListener {

  private View abfahrtView;
  private Rangliste dieListe;

  public Controller() {
    abfahrtView = new View();
    abfahrtView.setVisible(true);
    JButton zielBtn = abfahrtView.getBtnZiel();
    zielBtn.addActionListener(this);
    dieListe = new Rangliste();
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand().equals("Am Ziel")) {
      String name = abfahrtView.getName();
      String land = abfahrtView.getLand();
      int zeit = Integer.parseInt(abfahrtView.getZeit());
      dieListe.einsortieren(new Laeufer(name, land, zeit));
      this.listeZeigen();
      abfahrtView.setTextfelder("", "", "");
    }
  }

  private void listeZeigen() {
    abfahrtView.setErgebnisListe(dieListe.ausgabe());
  }
}
