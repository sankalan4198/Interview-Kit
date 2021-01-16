import java.util.Scanner;
public class InterchangeDigits {
    public static void main(String args[])
    {
        int num,count=0,num1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a two digit number: ");
        num=sc.nextInt();
        num1=((num%10)*10)+(num/10);
        while(num!=0)
        {
            num=num/10;
            count++;
        }

        if(count>2 || count <2)
        {
            System.out.println("Enter only TWO DIGIT numbers!!!");

        }
        else
        {

            System.out.println("The interchanged digit is: "+num1);
        }


    }
}
