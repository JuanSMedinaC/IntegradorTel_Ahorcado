import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 6000);
        Runnable matchRecThread=() ->
        {
            try{
                byte [] bf = new byte[500];
                socket.getInputStream().read(bf);
                String rec = new String(bf, "UTF-8");
                System.out.println(rec.trim());
                socket.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }


        };
        Thread runReader= new Thread(matchRecThread);
        runReader.start();


        System.out.println("Agregué información");

    }
}

