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
    ---------------------
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};

        int k = 6;
        int start=-1,end=-1;
        int maxLen=0;
        int len=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];
                {
                    if(sum==k)
                    {
                        len=j-i+1;
                        if(len>maxLen)
                        {
                            maxLen=len;
                            start=i;
                            end=j;
                        }
                    }
                }
            }
        }
        for(int i=start;i<=end;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}-------------------------------------------------

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
