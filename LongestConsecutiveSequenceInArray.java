import java.util.Arrays;

public class LongestConsecutiveSequenceInArray {
    public static void main(String args[])
    {
        int arr[]={3,8,5,7,6};
        Arrays.sort(arr);
        int count=1;
        for(int i=arr.length-1;i>0;i--)
        {
            if(arr[i]-arr[i-1]==1)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
