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

-------------------------------------------

28th May- 2026-- follow this works for eveything

	import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[]={3,8,5,7,6,11,14,13,12,15,16,19,4,17,18};
        Arrays.sort(arr);
        int count=1;
        int max=0;
        List<Integer> list= new ArrayList<>();
        int start=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]-arr[i]==1)
            {
                count++;
                if(count>max)
                {
                    max=count;
                    list.clear();
                    for(int j=start;j<=i+1;j++)
                    {
                        list.add(arr[j]);
                    }
                }
            }
            else if(arr[i+1]==arr[i])
            {
                continue;
            }
            else
            {
                count=1;
                start=i+1;
            }
        }
        System.out.println(list);
    }
}
