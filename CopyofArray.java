
import java.util.Scanner;

public class CopyofArray {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
        System.out.println("Enter all the elements:");
        n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            
        }
		int b[] = new int[a.length];
        b = a;

		System.out.println("Contents of a[] ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		System.out.println("\n\nContents of b[] ");
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
	}
}
