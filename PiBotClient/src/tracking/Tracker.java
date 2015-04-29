/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public Tracker(JPanel panel)
    {
        this.panel=panel;
    }
}
