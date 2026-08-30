import java.util.Scanner;
public class PrimeNumbersBetweenIntervals {
    public static void main(String args[])
    {
        int i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the upper limit: ");
        int l= sc.nextInt();
        System.out.println("Enter the lower limit: ");
        int u= sc.nextInt();

        for(int x=l+1;x<=u-1;u++)
        {
            for( i=2;i<x;i++)
            {
                if(x%i==0)
                    break;
            }
            if(i==x)
                System.out.println(x);
        }

    }
}
__________________________________________________

    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int low=3;
        int high=9;

        for(int x=low;x<=high;x++)
        {
            int count=0;
            for(int i=1;i<=x;i++)
            {
                if(x%i==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.print(x+" ");
            }

        }
        
        
    }
}
