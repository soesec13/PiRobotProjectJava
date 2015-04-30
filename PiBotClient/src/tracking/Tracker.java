package tracking;

import javax.swing.JPanel;

/**
 *
 * Übernimmt die Verfolgung der Befehle und zeichnet diese auf das JPanel
 * Muss auf Active gesetzt werden um gestartet zu werden
 */
public class Tracker {
    public static boolean ACTIVE=false;
    private JPanel panel;
    public Tracker()
    {
        
    }
    public void setPanel(JPanel panel)
    {
        this.panel=panel;
    }
}
