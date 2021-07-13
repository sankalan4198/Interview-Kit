public class DutchNationalFlag_CounterMethod {

    static void segregate(int arr[],int n)
    {
        int c0=0,c1=0,c2=0;
        int i;
        for( i=0;i<n;i++) {
            switch (arr[i]) {
                case 0: {
                    c0++;
                    break;
                }
                case 1: {
                    c1++;
                    break;
                }
                case 2: {
                    c2++;
                    break;
                }
            }
        }
            //UPDATE THE ARRAY
            i=0;
            while(c0>0)
            {
                arr[i++]=0;
                c0--;
            }
            while(c1>0)
            {
                arr[i++]=1;
                c1--;
            }
            while(c2>0)
            {
                arr[i++]=2;
                c2--;
            }
    }

    public static void main(String args[])
    {
        int arr[]={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n=arr.length;
        segregate(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
