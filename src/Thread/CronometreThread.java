package Thread;

import java.lang.ref.PhantomReference;

public class CronometreThread implements Runnable{

    private Thread thread;
    private final String threadname;

    CronometreThread(String threadname) {
        this.threadname=threadname;
        System.out.println("it's being created: "+threadname);

    }

    @Override
    public void run() {
        System.out.println("it runs: "+threadname);

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(threadname+" "+i);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            System.out.println("it was interrupted "+threadname);
        }

        System.out.println("Thread is over "+threadname);

    }

    public void starting() {
        System.out.println("Thread object is being formed");
        if (thread==null) {
            thread=new Thread(this,threadname);
            thread.start();
        }
    }
}
