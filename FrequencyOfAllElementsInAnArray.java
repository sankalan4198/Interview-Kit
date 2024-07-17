public class Main
{
	public static void main(String[] args) {
	   int arr[]={1,2,3,4,2,2,3,3,3,3,4,5,6};
	   int freq[]=new int[arr.length];
	   
	   int counted=-1;
	   
	   for(int i=0;i<arr.length;i++)
	   {
	       int count=1;
	       for(int j=i+1;j<arr.length;j++)
	       {
	           if(arr[i]==arr[j])
	           {
	               count++;
	               freq[j]=counted;
	           }
	       }
	       if(freq[i]!=counted)
	       {
	           freq[i]=count;
	       }
	   }
	   
	   for(int i=0;i<arr.length;i++)
	   {
	       if(freq[i]!=counted)
	       {
	           System.out.println(arr[i]+"---------------> "+freq[i]);
	       }
	       
	   }
	}
}


//Optimal via HashMap

import java.util.*;
public class CountFrequencyOfEachElement {

    public static void main(String args[])
    {
        int arr[] = {10,5,10,15,10,5};
        int n = arr.length;
        Frequency(arr, n);
    }
    static void Frequency(int arr[], int n)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            if (map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else
            {
                map.put(arr[i], 1);
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
