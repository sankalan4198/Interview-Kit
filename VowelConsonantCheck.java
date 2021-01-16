import java.util.Scanner;
public class VowelConsonant {
    public static void main(String args[])
    {
        Scanner sc=new Scanner((System.in));
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A' || ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println(ch+" is a vowel");
        }
        else if(ch>='0' && ch<='9')
        {
            System.out.println("Invalid input");
        }
        else if(ch=='!'|| ch=='@'|| ch=='#'|| ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*')
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println(ch+" is a consonant");
        }
    }
}
