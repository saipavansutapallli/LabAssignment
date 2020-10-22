import java.util.Scanner;

public class Star {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
			int n1 = scanner.nextInt();
            for(int i = 1; i <= n1; ++i) {
	            for(int j = 1; j <= i; ++j) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	    }
	
}
