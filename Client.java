import java.net.*;

public class Client {

    public static void main(String[] args, String string) {
        System.out.println("kasdkqldqdqd");
        try {

            System.out.println("Client is curious");

            Socket s = new Socket(string, 8000);

            System.out.println("Server is found");

            s.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}