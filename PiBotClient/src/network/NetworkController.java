package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * Sendet an den Roboter und empfängt die Antwort
 * Benötigt die IP oder den Hostnamen sowie den angesprochenen Port
 * Ich bin mir nicht sicher ob diese Klasse schon funktioniert
 */
public class NetworkController implements AbstractNetwork {

    private BufferedReader in;
    private PrintWriter out;

    public void connect(String hostName, int port)throws IOException
    {
        try {
            Socket socket = new Socket(hostName, port);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());
        } catch (IOException e) {
            throw new IOException("Couldnt connect to server");
        }
    }

    @Override
    public void send(String message) {
        out.println(message);
        out.flush();
    }

    @Override
    public String receive() throws IOException {
        return in.readLine();
    }
}
