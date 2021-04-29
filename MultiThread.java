
public class MultiThread extends Thread {
    String a;
    int x = 1;

    public MultiThread(String a) {
        this.a = a;
    }

    public void run() {
        synchronized (this) {
            for (int j = 1; j <= 5; j++) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }

                System.out.println(Thread.currentThread().getName() + " " + x++);
            }
        }

    }

    public static void main(String[] args) {
        MultiThread obj = new MultiThread("Tanvir");
        MultiThread obj2 = new MultiThread("Tasmia");
        obj.setName("hola");
        obj.start();
        try {

            obj.join(3000);

        } catch (Exception e) {
            System.out.println(e);
        }
        obj2.start();
    }
}

// start(): start a thread by calling its run() method

// sleep(): suspend a thread for a period of time

// join(): Wait for a thread to terminate

// getName(): It is used for Obtaining a thread’s name

// obj.getName()===> Tanvir
// obj2.getName()===>Tasmia

// getPriority(): Obtain a thread’s priority

// obj.getPriority()===> Shows the priority of thread object(0-10)

// isAlive(): Determine if a thread is still running
