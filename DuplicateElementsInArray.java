import java.util.Scanner;
public class DuplicateElements {
    public static void main(String args[])
    {
        int i,n,j;
        int arr[]= new int[100];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        n=sc.nextInt();
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The duplicate elements are: ");
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[i]+" ");
                }
            }
        }

    }
}
