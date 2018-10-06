package mind.chess.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author victor
 */
public class Server {
    public static void main(String[] args) {
        new Server(12345);
        System.out.println("Iniciando servidor...");
    }
    
    private int port;
    
    public Server(int port) {
        this.port = port;
    }
    
    public void execute() throws IOException {
        ServerSocket socketServer = new ServerSocket(this.port);
        System.out.println("Servidor iniciado com sucesso!");

        
        while (true) {
            // aguarda conexoes
            Socket client = socketServer.accept();
            System.out.println("O IP: "+client.getInetAddress().getHostAddress()+" conectou-se ao servidor!");
            
            // cria objeto para tratar conexões
            ConnectionTreatment ct = new ConnectionTreatment(client);
            
            // trata a conexão em uma nova thread
            new Thread(ct).start();
        }
        
    }
    
}
