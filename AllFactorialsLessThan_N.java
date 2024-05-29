
public class All_Factorials {

    int fact=1;
    public void findFactorials(int n)
    {
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
            if(fact<=n)
            {
                System.out.print(fact+" ");
            }
            else
            {
                break;
            }
        }
    }

    public static void main(String args[])
    {
        All_Factorials obj=new All_Factorials();
        obj.findFactorials(6);
    }

}



