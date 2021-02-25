package Wartezimmer;

/**
 * Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule, Materialien zum schulinternen Lehrplan Informatik SII
 */
import java.awt.event.*;

class FensterSchliesser extends WindowAdapter{

    public void windowClosing(WindowEvent winEvt){
        System.exit(0);
    }
}

