import java.util.Arrays;

public class TwoSum {

    public static void main(String args[])
    {
        int arr[]={2,6,5,8,11};
        int target=14;
        int[] ans=twoSum_BruteForce(arr,target);
        System.out.println(ans[0]+" "+ans[1]);
        twoSum_twoPointer(arr,target);

    }
    public static int[] twoSum_BruteForce(int arr[],int target)
    {
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }

    //Optimal approach- Two pointer
    public static void twoSum_twoPointer(int arr[],int target)
    {
        
        Arrays.sort(arr);
        int left=0,right=arr.length-1;

        while(left<=right)
        {
            int sum=arr[left]+arr[right];
            if(sum==target)
            {
                System.out.print(arr[left]+" "+arr[right]);
                left++;
                right--;
            }
            else if(sum<target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return;
    }
}
