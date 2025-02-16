//Naive method

public class Main
{
	public static void main(String[] args) {
		String str="Sankalan";
		
		for(int i=0;i<str.length();i++)
		{
		    for(int j=i+1;j<str.length();j++)
		    {
		        if(str.charAt(i)==str.charAt(j) && str.charAt(i)!=' ')
		        {
		            System.out.print(str.charAt(i)+" ");
		        }
		    }
		}
	}
}
/*______________________________________________________________________________________________________________________*/

//Method taking consideration of spaces and also what if there is no duplicate elements
public class DuplicateCharacters {  
     public static void main(String[] args) {  
        String string1 = "Great responsibility";  
        int count;  
          
        //Converts given string into character array  
        char string[] = string1.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");  
        //Counts each character present in the string  
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
        }  
    }  
}  


-----------------------------------------------------------------------------
//Method by not converting to char array

	public class Main
{
    public static void main(String[] args) {
        String string1 = "Great responsibility";
        
        //Since strings are immutable and to avoid duplicate encounters, we have to set the charAt[j] to marked ar line-72, so we are converting
        //the string to string builder to make it mutable
        StringBuilder sb = new StringBuilder(string1);
        
        int count;
        for(int i=0;i< sb.length();i++)
        {
            count=1;
            for(int j=i+1;j<sb.length();j++)
            {
                if(sb.charAt(i)==sb.charAt(j))
                {
                    count++;
                    sb.setCharAt(j, 'm');
                }
            }
            if(count>1 && sb.charAt(i)!='m')
            {
                System.out.print(sb.charAt(i));
            }
        }
        
    }
        
}

