package network;

import testEnviromnet.TestEnviroment;

/**
 *
 * Übernimmt die selbe Aufgabe wie der Network Controller, sendet aber statt an den Roboter and die TestEnviroment klasse
 */
public class TestNetworkController implements AbstractNetwork{
    
    private TestEnviroment testEnv;
    public TestNetworkController(TestEnviroment evn)
    {
        this.testEnv=evn;
    }
    @Override
    public void send(String message) {
        testEnv.receive(message);
    }
    @Override
    public String receive() throws Exception {
        return testEnv.send();
    }
    
}
