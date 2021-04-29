import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;

public class Server extends Thread {
    public void run() {

        try {
            Thread.sleep(1000);

            System.out.println("Client is curious");

            Socket s = new Socket("localhost", 8000);

            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            dout.writeUTF("I am a client");

            System.out.println("Server is found");

            s.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Server c = new Server();

        c.start();

        try {
            System.out.println("Server is ready");

            ServerSocket ss = new ServerSocket(8000);

            Socket s = ss.accept();

            DataInputStream fin = new DataInputStream(s.getInputStream());
            DataOutputStream fout = new DataOutputStream(s.getOutputStream());

            System.out.println((String) fin.readUTF());

            System.out.println("Client is accepted no matter what.");

            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}