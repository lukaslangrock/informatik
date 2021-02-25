package Arztpraxis;

/**
 * <p>Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule, Materialien zum schulinternen Lehrplan Informatik SII</p>
 * *
 * @version 2014-03-13
 */
import java.awt.event.*;

class FensterSchliesser extends WindowAdapter{

    public void windowClosing(WindowEvent winEvt){
        System.exit(0);
    }
}

