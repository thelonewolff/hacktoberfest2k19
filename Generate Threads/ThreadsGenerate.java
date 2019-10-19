import java.util.*;
import java.lang.*


class square implements Runnable
{
    int y;
    public square(int x)
    {
        y=x;
    }
    public void run()
    {
        System.out.println("Square of the number: "+(y*y));
        cube(y);//Use Threads to start a thread to find the cube of the given number y
    }
}

class cube(int x) //Something missing in the code here related to interfaces
{
    int y;
    public cube()
    {
        y=x;
    }//Use a constructor to assign the value of y
    public void run()
    {
        System.out.println("Cube of the number: "+(y*y*y));
    }
}

class generate implements Runnable
{
    public void run()
    {
        int num=0;
        Random r = new Random();
            num= r.nextInt(100);
                System.out.println("Number generated: "+num);
                Thread t1= new Thread(new square(num));
                t1.start();
    }
}

public class p3b
{
    public static void main(String args[])
    {
        for(int i=0;i<5;i++)
        {
            Thread t2= new Thread(new square(i)); //Generate a number using Threads and start the given thread
        
        try{
            sleep(1000); //Find the error in this given line
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    }
}
