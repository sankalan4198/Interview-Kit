// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[]={10,19,6,3,5};
        int minSwap=minSwaps(arr);
        System.out.print(minSwap);
        
    }
    public static int minSwaps(int arr[])
    {
        Map<Integer,Integer> map=new HashMap<>();
        int sortedArray[]=arr.clone();
        Arrays.sort(sortedArray);
        
        for(int i=0;i<sortedArray.length;i++)
        {
            map.put(sortedArray[i],i);
        }
        int i=0;
        int swap=0;
        
        while(i<arr.length)
        {
            if(map.get(arr[i])==i)
            {
                i++;
            }
            else
            {
                swap(arr,i,map.get(arr[i]));
                swap++;
            }
        }
        return swap;
    }
    
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
