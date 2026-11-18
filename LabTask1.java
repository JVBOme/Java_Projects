import java.util.Scanner;

public class LabTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] num = new int[3][3];
        // Put the numbers now
        System.out.println("Enter 9 numbers:");

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Enter number [" + row + "][" + col + "]: ");
                num[row][col] = sc.nextInt();
            }
        }
        // Displaying Both the Matrix and Row, Kuya said this is where it gets tricky as the values of Col and Sum can change after the fact.
        // Meaning it could theoritically display then change afterwards.
        System.out.println("\n================================\n                         Row Sum");
        int grandTotal = 0;
        for (int row = 0; row < 3; row++) {
            int sum = 0;
            for (int col = 0; col < 3; col++) {
                System.out.print(num[row][col] + "\t");
                sum += num[row][col];
            }
            System.out.println(" " + sum);
            grandTotal += sum;
        }
        //  Now Displaying the Column sums now while still having the logic from before
        for (int col = 0; col < 3; col++) {
            int sum = 0;
            for (int row = 0; row < 3; row++) {
                sum += num[row][col];
            }
            System.out.print(sum + "\t");
        }
        // Displaying the Final Total and the Graphics
        System.out.println(" " + grandTotal + "\nColumn Sum\n================================");

        sc.close();
    }
}