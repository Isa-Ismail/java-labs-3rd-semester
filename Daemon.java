public class Daemon extends Thread {
    String a;
    int x = 0;

    Daemon(String a) {
        this.a = a;
    }

    public void run() {
        this.setName(a);
        if (Thread.currentThread().isDaemon()) {// checking for daemon thread
            System.out.println("Successfully done nothing at all");
        } else {
            while (x < 5) {
                System.out.println("I am User thread buddy...... name is " + this.getName());
                x++;
            }
        }
    }

    public static void main(String[] args) {
        Daemon t1 = new Daemon("ninja");// creating thread
        Daemon t2 = new Daemon("ghost");
        Daemon t3 = new Daemon("psycho");

        t1.setDaemon(true);// now t1 is daemon thread
        t2.setDaemon(true);
        t1.start();// starting threads
        t2.start();
        t3.start();
    }
}