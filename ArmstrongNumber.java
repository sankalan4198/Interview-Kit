import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,r,c,sum=0,temp;
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            c=r*r*r;
            sum=sum+c;
            n=n/10;
        }
        n=temp;
        if(n==sum)
        {
            System.out.println(n+" is an Armstrong number.");
        }
        else
        {
            System.out.println(n+" is not an Armstrong number.");

        }
    }
}


//Method covering all number of digits
import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    int n,rem,c,temp,sum=0;
	    int digitCount=0;
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		temp=n;
		
		//Calculating digit digitCount
		
		while(n!=0)
		{
		    n=n/10;
		    digitCount++;
		}
		n=temp;
		while(n>0)
		{
		    rem=n%10;
		    c=(int)Math.pow(rem,digitCount);
		    sum=sum+c;
		    n=n/10;
		    
		}
		//System.out.println(digitCount);
		if(temp==sum)
		{
		    System.out.println("ARMSTRONGGG");
		    
		}
		else
		{
		    System.out.println("NOT ARMSTRONGGG");
		}
		
		
	}
}
