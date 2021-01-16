import java.util.Scanner;
public class LCM {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,lcm=0,max;
        System.out.println("Enter two integers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        {
            max=a;
        }
        else
            max=b;
        while(true)
        {
            if(max%a==0 && max%b==0)
            {
                lcm=max;
                break;
            }
            max++;
        }
        System.out.println("LCM is: "+lcm);
    }
}
