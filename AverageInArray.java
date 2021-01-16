import java.util.Scanner;
public class AverageInArray {
    public static void main(String args[])
    {
        int sum=0;
        float avg=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
            sum=sum+array[i];
        }
        avg=sum/n;
        System.out.println("The average is: "+avg);

    }
}
