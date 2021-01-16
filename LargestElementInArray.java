import java.util.Scanner;
public class LargestElementInArray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the number of elements: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=1;i<n;i++)
        {
            if(arr[0]<arr[i])
            {
                arr[0]=arr[i];
            }
        }
        System.out.println("The largest element is: "+arr[0]);
    }
}
