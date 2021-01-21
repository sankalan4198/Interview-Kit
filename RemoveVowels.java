import java.util.Scanner;
public class RemoveVowels {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1=sc.nextLine();
        String str2= str1.replaceAll("[aeiouAEIOU]","");
        System.out.println("After removing all vowels... ");
        System.out.println(str2);


    }
}
