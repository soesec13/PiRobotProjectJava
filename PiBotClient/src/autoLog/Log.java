
package autoLog;

import java.io.*;
import movementController.MovementController;

/**
 *
 * Speichert die Bewegungen und kann sie wiederholen
 */
public class Log {
    public static boolean ACTIVE=false;
    public static final String TRENNZEICHEN="#";
    private BufferedWriter wr;
    private BufferedReader rd;
    private MovementController controller;
    public Log(File f,MovementController controller) throws FileNotFoundException, IOException
    {
        this.controller=controller;
        rd=new BufferedReader(new FileReader(f));
        wr=new BufferedWriter(new FileWriter(f));
    }
    public void runFromLog() throws IOException, Exception
    {
        //1. A#type#speed
        String line=null;
        while((line=rd.readLine())!=null)
        {
            String[] commands=line.split(Log.TRENNZEICHEN);
            switch(commands[0])
            {
                case "A":
                    controller.move(commands[1], Integer.parseInt(commands[2]));
                    break;
            }
        }
    }
    public void saveCommand(String s) throws IOException
    {
        wr.write(s);
        wr.newLine();
        wr.flush();
    }
}
