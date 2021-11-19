class  A extends Thread
{
    public  void fun ()
    {
        try {
            for (int i=1 ;i<= 5;i++)
            {
                System.out.println("Kajal");
                Thread.sleep(1000);
            }
        }
      catch (InterruptedException i)
      {

      }
    }
}


public class B {
    public static  void main(String[] args) throws InterruptedException
    {
        A t = new A();
        t.fun();
        for (int i=1 ;i<= 5;i++)
        {
            System.out.println("Ayush");
            Thread.sleep(1000);
        }
    }

}
