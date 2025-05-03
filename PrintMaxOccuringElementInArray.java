// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[]={1,2,1,4,2,5,2};
        int maxEle=arr[0];
        int max;
        int freq[]=new int[arr.length];
        //int count=0;
        int i,j;
        
        for(i=0;i<arr.length;i++)
        {
            int count=0;
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    freq[j]='0';
                }
            }
            if(freq[i]!='0')
            {
                freq[i]=count;
            }
        }
        max=freq[0];
        for(i=0;i<arr.length;i++)
        {
            if(freq[i]!='0' && max<freq[i])
            {
                max=freq[i];
                maxEle=arr[i];
                System.out.println(maxEle);
            }
        }
    }
}
