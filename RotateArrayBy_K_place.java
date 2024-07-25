public class LeftRotateArrayBy_K_Place {

    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        int n=arr.length;
        rotateArray(arr,k,n);
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void rotateArray(int arr[], int k, int n)
    {
        if(n==0)
            return;
        k=k%n;
        if(k>n)
            return;

        int temp[]=new int[k];

        //Storing temp
        int j=0;
        for(int i=0;i<k;i++)
        {
            temp[j++]=arr[i];
        }

        //Shifting
        for(int i=k;i<n;i++)
        {
            arr[i-k]=arr[i];
        }

        //Putting back temp into last step
        j=0;
        for(int i=n-k;i<n;i++)
        {
            arr[i]=temp[j];
            j++;

        }


    }
}
