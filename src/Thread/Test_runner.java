package Thread;

public class Test_runner {
    public static void main(String[] args) {
        CronometreThread thread1=new CronometreThread("thread1");
        CronometreThread thread2=new CronometreThread("thread2");
        CronometreThread thread3=new CronometreThread("thread3");

        thread1.starting();
        thread2.starting();
        thread3.starting();

    }
}
