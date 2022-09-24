//Program to Find if the maximum & minimum occurences of character in string
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   String str="Sankalan Paul";
	   str=str.replaceAll("\\s","");
	   int i,max,min;
	   char minChar = str.charAt(0), maxChar = str.charAt(0); 
	   int freq[]=new int[256];
	   
	   for(i=0;i<str.length();i++)
	    {
	        freq[(int)str.charAt(i)]++;
	    }
	    
	    for(i=0;i<256;i++)
	    {
	        if(freq[i]!=0)
	        {
	            System.out.println((char)i+"--------"+freq[i]);
	        }
	    }
	    
	    System.out.println("---------Max & Min occurence of character-----------");
	    
	    min=max=freq[0];
	     for(i = 0; i <256; i++) 
    	  {    
              if(min > freq[i] && freq[i] != '0') 
    		  {    
                  min = freq[i];    
                  minChar = (char)i;    
              }    
              if(max < freq[i]) 
    		  {    
                  max = freq[i];    
                  maxChar = (char)i;   
              }    
          }             
      System.out.println("Minimum occurring character: " + minChar);    
      System.out.println("Maximum occurring character: " + maxChar);
	}
}
