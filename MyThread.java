//Synchronized
class Sync {
    int x = 0;

    synchronized static void hey() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {

            }
            System.out.println(" " + "Synced well " + i);

        }
    }
}

class MyThread1 extends Thread {
    int x;
    Sync d;

    public MyThread1(int x) {
        this.x = x;
    }

    public void run() {
        System.out.println(this.getName() + " " + x++);
        Sync.hey();
    }
}

public class MyThread extends Thread {
    int x;
    Sync s;

    public MyThread(int x) {
        this.x = x;
    }

    public void run() {
        System.out.println(this.getName() + " " + x++);
        Sync.hey();
    }

    public static void main(String[] args) {
        new MyThread(5).start();
        new MyThread1(3).start();
    }
}
// new MyThread(5);
//// new