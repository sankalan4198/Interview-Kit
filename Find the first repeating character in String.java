import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String str="hello geeks";
	    char arr[]=str.toCharArray();
	    int count=0;
	    
	    for(int i=0;i<str.length();i++)
	    {
	        for(int j=i+1;j<str.length();j++)
	        {
	            if(arr[i]==arr[j])
	            {
	                System.out.println(arr[i]);
	                System.exit(0);
	            }
	            
	        }
	        
	    }
	    
	}
}
