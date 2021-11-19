class C implements Runnable
{
    public  void run()
    {
        for (int i = 1;i<=5;i++)
            System.out.println("My child thread");
    }
}

public class Demo {
    public static void main(String[] args) {
     C c = new C();
     Thread thread = new Thread(c);
     thread.start();
        {
            for (int i = 1;i<=5;i++)
                System.out.println("My main thread");
        }
    }
}
