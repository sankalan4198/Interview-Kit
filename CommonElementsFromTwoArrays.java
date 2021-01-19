import java.util.Scanner;
public class CommonElementsFromTwoArrays {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,i,j;
        System.out.println("Enter no of elements for Array1: ");
        n1=sc.nextInt();
        System.out.println("Enter no of elements for Array2: ");
        n2=sc.nextInt();
        int arr1[]=new int[100];
        int arr2[]= new int[100];
        System.out.println("Enter the elements from Array1: ");
        for(i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements from Array2: ");
        for(j=0;j<n2;j++)
        {
            arr2[j]=sc.nextInt();
        }

        System.out.println("The common elements from both arrays are: ");
        for(i=0;i<n1;i++)
        {
            for(j=0;j<n1;j++)
            {
                if(arr1[i]==arr2[j])
                    System.out.print(arr1[i]+" ");
            }
        }
        }
    }
