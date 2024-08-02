public class LongestSubarrayWithGivenSum {

    public static void main(String args[])
    {
        int arr[]={2,3,5};
        int k=10;
        int ans1=longestSubarray_Bruteforce(arr,k);
        System.out.println(ans1);
        int ans2=longestSubArray_TwoPointer(arr,k);
        System.out.println(ans2);
    }

    public static int longestSubarray_Bruteforce(int arr[], int k)
    {
        int n=arr.length;
        int len=0;
        int i,j;
        for(i=0;i<n;i++)
        {
            int sum=0;
            for(j=i;j<n;j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    public static int longestSubArray_TwoPointer(int arr[], int k)
    {
        int n=arr.length;
        int left=0,right=0;
        int sum=arr[0];
        int len=0;

        while(right<n)
        {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while(left<=right && sum>k)
            {
                sum=sum-arr[left];
                left++;
            }
            // if sum = k, update the maxLen i.e. answer:
            if(sum==k)
            {
                len=Math.max(len,right-left+1);
            }
            // Move forward thw right pointer:
            right++;
            if(right<n)
            {
                sum=sum+arr[right];
            }
        }
        return len;
    }
}
