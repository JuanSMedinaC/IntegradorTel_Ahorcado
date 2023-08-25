import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        while (true){

            try {
                ServerSocket serverSocket = new ServerSocket(6000);
                Socket player1=serverSocket.accept();
                Socket player2=serverSocket.accept();
                Match match=new Match(player1,player2);
                new Thread(match).start();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}