package network;

/**
 *
 * Interface der Netzwek Aufgaben
 * Sinn: Ermöglicht Polymorphie
 */
public interface AbstractNetwork {
    public abstract void send(String message);
    public abstract String receive() throws Exception;
}
