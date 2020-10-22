import java.util.Scanner;
public class Gradepoint {
    private int[] g;
    private Scanner in;
    public static void main(String[] args)
    {
        Gradepoint a = new Gradepoint();
        a.in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num = a.in.nextInt();
        a.display(num);
    }
        
    private void display(int num)
    {        
        g = new int[num];
        double sum = 0;
        int    i   = 0;
        while (i < num)
        {
            System.out.printf("Enter the grade for student %d: ", (i+1));
            int g1= in.nextInt();
            if ((g1 >= 0) && (g1 <= 100)) {
                g[i] = g1;
                sum      += g1;
                i++;
                continue;
            }
            System.out.println("Invalid grade, try again...");
        }
        System.out.printf("The average is : %.2f\n", (sum / num));
    }
    
}