import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		int[] arr = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]!=0)
		    {
		        arr[k++]=arr[i];
		    }
		}
		
		for(int i=k;i<arr.length;i++)
		{
		    arr[k++]=0;
		}
		System.out.println(Arrays.toString(arr));
	}
}


//Without creating any extra space/array
public class MoveAllZeroes_to_Right {

    public static void main(String args[]) {

        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = moveZeros(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");

    }
        public static int[] moveZeros(int n, int []a) {
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        //no non-zero elements:
        if (j == -1)
            return a;

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        return a;
    }

}

