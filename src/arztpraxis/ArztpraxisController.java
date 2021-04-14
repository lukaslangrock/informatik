package arztpraxis;

import lib.Queue;

/**
 * <p>Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule, Materialien zum schulinternen Lehrplan Informatik SII</p>
 * *
 * @version 2014-03-13
 */

public class ArztpraxisController {
    private ArztpraxisView praxisGUI;
    private Queue<Patient> sprechzimmerWarteschlange;
    private Queue<Patient> blutdruckmessungWarteschlange;

    public ArztpraxisController() {
        praxisGUI = new ArztpraxisView();
        sprechzimmerWarteschlange = new Queue<Patient>();
        blutdruckmessungWarteschlange = new Queue<Patient>();
        //imSprechzimmer = null;

        praxisGUI.setzeArztpraxisController(this);
        praxisGUI.setVisible(true);
    }

    public static void main(String[] args) {
        new ArztpraxisController();
    }

    public void bearbeiteAnmeldungSprechzimmer(String pName, String pKasse)
    {
        sprechzimmerWarteschlange.enqueue(new Patient(pName, pKasse));
        vorschauNaechsterPatient();
    }

    public void bearbeiteAnmeldungBlutdruckmessung(String pName, String pKasse)
    {
        blutdruckmessungWarteschlange.enqueue(new Patient(pName, pKasse));
        vorschauNaechsteMessung();
    }

    public void bearbeiteAnmeldungSprechzimmerUndBlutdruckmessung(String pName, String pKasse)
    {
        bearbeiteAnmeldungSprechzimmer(pName, pKasse);
        bearbeiteAnmeldungBlutdruckmessung(pName, pKasse);
    }

    public void bearbeiteNaechsterPatient()
    {
        praxisGUI.setzeInsSprechzimmer(sprechzimmerWarteschlange.front().getName());
        sprechzimmerWarteschlange.dequeue();

        vorschauNaechsterPatient();
    }
    
    public void bearbeiteNaechsteMessung()
    {
        blutdruckmessungWarteschlange.dequeue();
        praxisGUI.setzeNaechsterBD(blutdruckmessungWarteschlange.front().getName());
        
        vorschauNaechsteMessung();
    }

    public void vorschauNaechsterPatient()
    {
        if (!sprechzimmerWarteschlange.isEmpty())
        {
            praxisGUI.setzeNaechster(sprechzimmerWarteschlange.front().getName());
        }
        else
        {
            praxisGUI.setzeNaechster("");
        }
    }

    public void vorschauNaechsteMessung()
    {
        if (!blutdruckmessungWarteschlange.isEmpty())
        {
            praxisGUI.setzeNaechsterBD(blutdruckmessungWarteschlange.front().getName());
        }
        else
        {
            praxisGUI.setzeNaechsterBD("");
        }
    }
}
