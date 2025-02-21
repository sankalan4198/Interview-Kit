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


//How to Print the Longest Consecutive Sequence in Arra

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[]={3,5,6,7,8,10};
		//Arrays.sort(arr);
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length-1;i++)
		{
		    if(arr[i+1]-arr[i]==1)
		    {
		        set.add(arr[i]);
		        set.add(arr[i+1]);
		    }
		}
		System.out.print(set);
	}
	
}
