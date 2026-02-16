import java.util.Scanner;
public class ASCII_value {
    public static void main(String args[])
    {
        Scanner sc= new Scanner((System.in));
        System.out.println("Enter a character: ");
        char c= sc.next().charAt(0);
        int asc =(int)c;
        System.out.println("The ascii value is "+asc);
    }
}


//Withouy contains
public class Main
{
	public static void main(String[] args) {
	    String str="Sankalan Paul Chowdhury";
	    String substring="Roy";
	    String arr[]=str.split(" ");
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i].equals(substring))
	        {
	            System.out.print("Yes");
	            break;
	        }
	    }
	}
}
