package movementController;

import autoLog.Log;
import java.io.IOException;
import network.AbstractNetwork;
import network.NetworkController;

/**
 *
 * Steuert die Bewegungen des Roboters
 * network kann geändert werden um zwischen test und tatsächlichem Roboter zu wechseln
 */
public class MovementController {
    private AbstractNetwork network;
    private int currentX;
    private int currentY;
    private Log log;
    public void setNetwork(NetworkController set,Log log)
    {
        this.network=set;
        this.log=log;
    }
    public String move(String type,int speed) throws IOException, Exception //Message: int Leftwheel#int Rightwheel
                                                                            // Unsicher
    {
        String sendMessage="";
        switch(type)
        {
            case "forward":
                sendMessage=""+speed+"#"+speed;
                break;
            case "back":
                sendMessage="-"+speed+"#-"+speed;
                break;
            case "TRight":
                sendMessage=""+speed+"#-"+speed;
                break;
            case "TLeft":
                sendMessage="-"+speed+"#"+speed;
                break;
            case "Right":
                sendMessage=""+speed+"#0";
                break;
            case "Left":
                sendMessage="0#"+speed;
                break;
        }
        network.send(sendMessage);
        //Save as A#type#speed
        if(Log.ACTIVE)
        {
            log.saveCommand("A#"+type+"#"+speed);
        }
        String ret = network.receive();
        return calculateMessage(ret);
    }
    private String calculateMessage(String ret) {
        String msg="";
        
        return msg;
    }
    public String moveTo(int x,int y)//Unfinished
    {
        return "";
    }

    public void setCurrentX(int currentX) {
        this.currentX = currentX;
    }

    public void setCurrentY(int currentY) {
        this.currentY = currentY;
    }


    
    
    
}
