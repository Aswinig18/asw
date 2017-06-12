import java.io.*;
import java.util.*;
class year
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        if(t%4==0)
        {
            System.out.println("leap year");
        }
        else
        {
        System.out.println("not");    
        }
    }
}


