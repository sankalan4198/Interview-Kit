//FOR STRING
 concept is SWAP-->RECURSE-->SWAP AGAIN
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        String str= "ABC";
        char arr[]= str.toCharArray();
        permute(arr,0);
    }

    public static void permute(char arr[],int index)
    {
        if(arr.length==index)
        {
            System.out.println(arr);
            return;
        }

        for(int i=index;i<arr.length;i++)
        {
            //SWAP
            char temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;

            //RECURSE
            permute(arr,index+1);

            //Swap again
            temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;

        }
    }
}
-----------------------------------------------------

  For int array

  // Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        
        permute(arr,0);
    }

    public static void permute(int arr[],int index)
    {
        if(arr.length==index)
        {
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]);
            }
            System.out.println();
            return;
        }

        for(int i=index;i<arr.length;i++)
        {
            //SWAP
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;

            //RECURSE
            permute(arr,index+1);

            //Swap again
            temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;

        }
    }
}
