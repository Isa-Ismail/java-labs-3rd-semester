public class SyncMethod extends Thread {
    String x;

    public SyncMethod(String a) {
        this.x = a;
    }

    synchronized void count() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            System.out.println(x + " " + "didnt Synced well");
        }

    }

    public void run() {

        this.count();
        // System.out.println(x + " is running");
    }

    public static void main(String[] args) {
        SyncMethod obj = new SyncMethod("Hello");
        SyncMethod obj1 = new SyncMethod("World");
        obj.start();
        obj1.start();
        // obj.count();
        // obj1.count();

    }
}
