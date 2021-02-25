package Wartezimmer;

import java.awt.event.*;

class Wartezimmer implements ActionListener{
    private WartezimmerOberflaeche wz;
    private Queue<Patient> waitingline;

    public static void main(String[] args) {
        new Wartezimmer(new WartezimmerOberflaeche());
    }
    public Wartezimmer(WartezimmerOberflaeche w){
        waitingline = new Queue<Patient>();
        wz=w;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("anmelden")){
            registerPatient(new Patient(wz.getEingabeName(), wz.getEingabeKasse()));
            wz.setEingabeName("");
            wz.setEingabeKasse("");
        }
        else if (e.getActionCommand().equals("rufen")) {
            wz.setAnzeige(callPatient().getName());
        }
    }

    public void registerPatient(Patient pPatient)
    {
        waitingline.enqueue(pPatient);
    }

    public Patient callPatient()
    {
        Patient patient = null;
        if (!waitingline.isEmpty())
        {
            patient = (Patient)waitingline.front();
            waitingline.dequeue();
        }

        return patient;
    }
}
