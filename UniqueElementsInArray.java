import java.util.Scanner;
public class UniqueeLElements {
    public static void main(String args[]) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");

        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("\nThe distinct elements of above array are: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;
            if (i == j)
                System.out.print(arr[i] + " ");
        }
    }
}
