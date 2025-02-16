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
---------------------------------------------------------------
    //Code to print the repeated character only once.
    //Here we add an extra check to see if the number is already printed or not

    public class Main
{
    public static void main(String[] args) {
        int arr[]={2,3,1,4,2,2,3,6,5,4};
        
        for(int i=0;i<arr.length;i++) {
            boolean isPrinted = false;
            for(int k=0;k<i;k++) {
                if(arr[i] == arr[k]) {
                    isPrinted = true;
                    break;
                }
            }
            if (isPrinted) {
                continue;
            }
            
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}
