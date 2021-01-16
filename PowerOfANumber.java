import java.util.Scanner;
public class PowerOfANumber {
    public static void main(String args[])
    {
        int base, power, i;
        long ans=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base number: ");
        base=sc.nextInt();
        System.out.println("Enter the power: ");
        power=sc.nextInt();
        if(power==0)
            System.out.println("The answer is: 1");
        else
            for(i=1;i<=power;i++)
                ans=ans*base;
        System.out.println("The answer is: "+ans);

    }
}
