package mind.chess.server;

import java.net.Socket;

/**
 *
 * @author victor
 */
public class ConnectionTreatment implements Runnable {

    Socket socket;
    
    public ConnectionTreatment(Socket socket) {
        this.socket = socket;
    }
    
    @Override
    public void run() {
        
    }
    
}
