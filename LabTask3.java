import java.util.Scanner;

public class LabTask3 {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("-----------------------------------------------------\n");

        System.out.print("Enter the Student Number \t:");
        int studentNumber = scanner.nextInt();

        System.out.print("Enter the Student Name \t\t:");
        String studentName = scanner.next();

        System.out.print("Enter the Course \t\t:");
        String course = scanner.next();

        System.out.print("Enter the Year Level \t\t:");
        int yearLevel = scanner.nextInt();

        System.out.print("-----------------------------------------------------\nEnter Grades:\n");

        System.out.print("Enter the Grade 1 \t\t:");
        int grade1 = scanner.nextInt();

        System.out.print("Enter the Grade 2 \t\t:");
        int grade2 = scanner.nextInt();

        System.out.print("Enter the Grade 3 \t\t:");
        int grade3 = scanner.nextInt();

        System.out.print("-----------------------------------------------------\n");
        System.out.print("Display Letter Grades or Numeric Grades? [L/N]");
        char choice = scanner.next().charAt(0);
        System.out.print("\n-----------------------------------------------------\n");
        studinfo(studentNumber, studentName, course, yearLevel);
        System.out.print("-----------------------------------------------------\n");
        getEquiv(getAverage(grade1, grade2, grade3), choice);
        displayResult(grade1, grade2, grade3);
        System.out.print("-----------------------------------------------------\n");
        scanner.close();
    }

    public static void studinfo(int studentNumber, String studentName, String course, int yearLevel) {
        System.out.println("Student Number \t\t\t:" + studentNumber);
        System.out.println("Student Name \t\t\t:" + studentName);
        System.out.println("Course \t\t\t\t:" + course);
        System.out.println("Year Level \t\t\t:" + yearLevel);
    }
    public static double getAverage(int grade1, int grade2, int grade3) {
        double average = (grade1 + grade2 + grade3) / 3.0;
        return average;
    }
    public static String getRemark(double average) {
        if (average <= 60) {
            return "Failed";
        } else if (average >= 70) {
            return "Passed";
        }
        return "Average";
    }

    public static void getEquiv(double average, char choice) {

        System.out.println("Average \t\t\t:" + average);

        switch(choice) {
            case 'L': case 'l': 
                if (average >= 90) {
                    System.out.println("Avarage is \t\t\t:A");
                } else if (average >= 80) {
                    System.out.println("Average is \t\t\t:B");
                } else if (average >= 70) {
                    System.out.println("Average is \t\t\t:C");
                } else if (average >= 60) {
                    System.out.println("Average is \t\t\t:D");
                } else {
                    System.out.println("Average is \t\t\t:F");
                }
                break; 
        case 'N': case 'n':
                if (average <= 100) {
                    System.out.println("Average is \t\t\t:4.00");
                } else if (average <= 95) {
                    System.out.println("Average is \t\t\t:3.50");
                } else if (average <= 89) {
                    System.out.println("Average is \t\t\t:3.00");
                } else if (average <= 83) {
                    System.out.println("Average is \t\t\t:2.50");
                } else if (average <= 76) {
                    System.out.println("Average is \t\t\t:2.00");
                } else if (average <= 69) {
                    System.out.println("Average is \t\t\t:1.00");
                }
                break;
                }
    }

    public static void displayResult(int grade1, int grade2, int grade3) {
        double average = getAverage(grade1, grade2, grade3);
        String remark = getRemark(average);

        System.out.println("Remark  \t\t\t:" + remark);
    }

}