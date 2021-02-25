import java.util.Arrays;
import java.util.Scanner;
public class MedianOfArray {
    public static void main(String args[])
    {
        double m=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        System.out.println("Enter the elements: ");
        double arr[]= new double[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextDouble();
        }

       Arrays.sort(arr);

        if(n%2==1) //if the no of elements is ODD//
        {
            m=arr[(n+1)/2-1];
        }
        else
        {
            m=(arr[n/2-1]+arr[n/2])/2;
        }

        System.out.println("The median is:  "+m);



    }
}
