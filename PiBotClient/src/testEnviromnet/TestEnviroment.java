package testEnviromnet;

import network.TestNetworkController;
import tracking.Tracker;

/**
 *
 * Soll die Funktionen haben wie die tatsächliche(n) C++ Klasse(n)
 */
public class TestEnviroment {
    private int x=0,y=0;
    private int lookingDirection=0;//Je nachdem wo hin der Robter schaut
    private TestNetworkController control;
    public TestEnviroment(TestNetworkController control,Tracker tracker)
    {
        this.control=control;
    }
    public void receive(String message)
    {
        
    }
    public String send()
    {
        String message=""+x+"#"+y+"#"+lookingDirection;
        return message;
    }
}
