import java.io.IOException;
import java.net.Socket;

public class Match implements Runnable {
    Socket player1;
    Socket player2;
    public Match(Socket player1, Socket player2){
        this.player1=player1;
        this.player2=player2;
    }

    @Override
    public void run() {
        try {
            player1.getOutputStream().write("Has sido emparejado".getBytes());
            player2.getOutputStream().write("Has sido emparejado".getBytes());
            while (true){

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
