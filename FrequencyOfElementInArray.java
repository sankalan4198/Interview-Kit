import java.util.Scanner;
public class FrequencyOfElementsInArray {
    public static void main(String args[])
    {
        int i,j,count;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of elements in the array: ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        int freq[]=new int[100];
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            freq[i]=-1;
        }
        for(i=0;i<n;i++)
        {
            count =1;

            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    freq[j]=0;
                }
            }
            if(freq[i]!=0)
            {
                freq[i]=count;
            }
        }
        System.out.println("Frequency of all elements are: ");
        for(i=0;i<n;i++)
        {
            if(freq[i]!=0)
            {
                System.out.println(arr[i]+" occurs "+freq[i]+" times.");
            }
        }

    }

}
