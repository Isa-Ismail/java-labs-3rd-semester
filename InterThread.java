public class InterThread implements Runnable {
    String name;
    int timeout;
    int x = 0;
    Thread t;

    InterThread(String a, int b) {
        this.name = a;
        this.timeout = b;
        t = new Thread(this, name);
        t.start();
    }

    public void run() {
        System.out.println("Count down starts");
        while (x <= timeout) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(name + " running " + x++);
        }
    }

    public static void main(String[] args) {
        new InterThread("Stopwatch", 20);
    }
}
