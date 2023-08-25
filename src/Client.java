import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 6000);
    }

    public void crearPalabra(){
        System.out.println("Hola");

        System.out.println("Agregué información");

    }
}
