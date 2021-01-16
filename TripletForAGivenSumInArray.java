import java.util.Scanner;
public class TripletForAGivenSumInArray {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n,i;
        System.out.println("Enter the number of elements: ");
        n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements: ");

        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the sum value: ");
        int sum=sc.nextInt();
        System.out.println("The triplets are: ");
        TripletForAGivenSumInArray ft=new TripletForAGivenSumInArray();

        ft.findTriplets(arr,n,sum);

    }

    public static void findTriplets(int arr[],int n, int sum)
    {
        int i,j,k;
        for(i=0;i<n-2;i++)
        {
            for(j=i+1;j<n-1;j++)
            {
                for(k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==sum)
                    {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" ");

                    }
                }
            }
        }
    }
}

