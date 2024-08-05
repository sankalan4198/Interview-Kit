import java.util.Arrays;

public class TwoSum {

    public static void main(String args[])
    {
        int arr[]={2,6,5,8,11};
        int target=14;
        int[] ans=twoSum_BruteForce(arr,target);
        System.out.println(ans[0]+" "+ans[1]);
        int[] answer=twoSum_twoPointer(arr,target);
        System.out.println(answer[0]+" "+answer[1]);

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
    public static int[] twoSum_twoPointer(int arr[],int target)
    {
        int answer[]=new int[2];
        Arrays.sort(arr);
        int left=0,right=arr.length-1;
        answer[0]=answer[1]=-1;

        while(left<=right)
        {
            int sum=arr[left]+arr[right];
            if(sum==target)
            {
                answer[0]=left-1;
                answer[1]=right;
                return answer;
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
        return answer;
    }
}
