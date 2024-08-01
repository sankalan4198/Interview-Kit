public class FindMissingElementOfArray {

    public static void main(String args[])
    {
        int arr[]={1,2,4,5};
        int N=5;
        findMissing(arr,N);
    }

    //BruteForce-Linear search using flags
    public static int findMissing(int arr[], int N)
    {
        int sum=(N*(N+1))/2;
        int s2=0;
        for(int i=0;i<N-1;i++)
        {
            s2=s2+arr[i];
        }
        int missing=sum-s2;
        System.out.println(missing);
        return 0;
    }
}
