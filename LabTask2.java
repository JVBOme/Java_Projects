import java.util.*;

public class ThreeDClasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[][][] array3D = new float[2][3][3]; // This is a 3D array with 2 sections, 3 students, and 3 subjects (Java, Database, Networking)
        do {
            System.out.println("Enter Section,Student, then Subject grade:"); // Prompting the user to enter grades for each section, student, and subject
            for (int x = 0; x < 2; x++) {
                for (int y = 0; y < 3; y++) {
                    for (int z = 0; z < 3; z++) {
                        System.out.print("Enter Section: [" + x + "], Student: [" + y + "], Subject: [" + z + "]: ");
                        array3D[x][y][z] = scanner.nextFloat();
                    }
                }
            }
            
            for (int x = 0; x < 2; x++) { System.out.println("Section " + (x + 1) + ":\n--------------------");// Displaying the grades for each section
                for (int y = 0; y < 3; y++) {
                    for (int z = 0; z < 1; z++) {
                        System.out.printf("Student %d:\nJava: %.2f \nDatabase: %.2f \nNetworking: %.2f \n" + "\nStudent Average: %.2f\n\n", y + 1, array3D[x][y][z],array3D[x][y][z],array3D[x][y][z], (array3D[x][y][0] + array3D[x][y][1] + array3D[x][y][2]) / 3.0, "\nSection Average: " + ((array3D[x][0][0] + array3D[x][0][1] + array3D[x][0][2] + array3D[x][1][0] + array3D[x][1][1] + array3D[x][1][2] + array3D[x][2][0] + array3D[x][2][1] + array3D[x][2][2]) / 9.0));
                        // Displaying the grades for each student and their average
                    }   // Displaying the average for each section
                    System.out.println();
                }
                System.out.println();
            }
            System.out.print("Do you want to enter new values? (yes/no): ");// Asking the user if they want to enter new values
        } while (scanner.next().equalsIgnoreCase("yes"));
    }
}