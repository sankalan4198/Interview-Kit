import java.util.Arrays;

public class Main
{
  public static void main (String[]args)
  {
    int arr[] = { -1, 1, 5, 5, 7 };
    int sum = 6;
    Arrays.sort (arr);

    int low = 0;
    int high = arr.length - 1;

    while (low < high)
      {
	if (arr[low] + arr[high] == sum)
	  {
	    System.out.println (arr[low] + "," + arr[high]);
	    low++;
	    high--;
	  }
	else if (arr[low] + arr[high] < sum)
	  {
	    low++;
	  }
	else
	  {
	    high--;
	  }
    }
  }
}
