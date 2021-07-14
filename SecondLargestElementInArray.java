public class SecondLargestElementInArray {
    public static void main(String args[])
    {
        int arr[]={12,35,1,10,34,1};
        int i,first,second;

        first=second=Integer.MIN_VALUE;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first)
            {
                second=arr[i];
            }
        }
        if(second== Integer.MIN_VALUE)
        {
            System.out.println("NO 2ND LARGEST ELEMENT");
        }
        else
        {
            System.out.println("The 2nd largest element is: "+second);
        }
    }

}
