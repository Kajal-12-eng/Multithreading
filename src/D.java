class F extends Thread
{
    public  void run()
    {
        String n= Thread.currentThread().getName();
        for (int i=1;i<=3;i++)
        {
            System.out.println(n);
        }
    }

}

 public class D {
    public static void main(String[] args) {
     F t1 = new F();
     F t2 = new F();
     F t3 = new F();
      t1.setName("Thread 1");
      t2.setName("Thread 2");
      t3.setName("Thread 3");

      t1.start();;
      t2.start();
      t3.start();

      String n = Thread.currentThread().getName();
      for (int i=1 ;i<=3;i++)
      {
          System.out.println(n);
      }
    }
}
