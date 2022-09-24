//Program to Find if the string cntains all unique characters

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String str="index of";
	    char arr[]=str.toCharArray();
	    int count=0;
	    
	    for(int i=0;i<str.length();i++)
	    {
	        for(int j=i+1;j<str.length();j++)
	        {
	            if(str.charAt(i)==str.charAt(j))
	            {
	                count++;
	            } 
	        }
	    }
	    
	    if(count>0)
	    {
	        System.out.println("Not Unique");
	    }
	    else{
	        System.out.println("Unique characters in string");
	    }
	    
	}
}
