public class Hola {

    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Hello");
        System.out.println();
    }
}
