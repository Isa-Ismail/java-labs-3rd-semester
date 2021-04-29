public class Priority implements Runnable {
    Thread t;
    String n;

    Priority(String n, int x) {
        this.n = n;
        t = new Thread(this, n);
        t.setPriority(x);
        t.start();
    }

    public void run() {
        System.out.println("priority of class " + n + " is " + t.getPriority());
        if (t.getPriority() > 5) {
            //Gets the name
            System.out.println(t.getName() + " got access (priority access 5+)");
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        new Priority("Ninja", 7);
        new Priority("Ranger", 2);
        new Priority("Companion", 3);
        new Priority("General", 10);

    }
}

// 1-10

// MyInterface obj= new MyInterface('one')

// Thread t= new Thread(this)


// t.getPriority()

// returns a integer