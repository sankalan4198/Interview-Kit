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
___________________________________________________________________

    //FOR ARR SERIES NOT STARTING WITH 1, WHERE WE CANT APPLY SUM OF N NUMBERS FORMULA

    public class Main
{
	public static void main(String[] args) {
	    int arr[]={5,6,7,9,10};
	    int diff=0;
	    for(int i=1;i<arr.length;i++)
	    {
	        for(int j=i+1;j<arr.length;j++)
	        {
	            if(arr[j]-arr[i]==2)
	            {
	                System.out.println(arr[i]+1);
	                //System.exit(0);
	            }
	        }
	    }
	    
	}
}
