import java.util.Scanner;

public class IT26510294Lab9Q4 {

    static double calcFinalMark(double a, double e) {
        return a * 0.3 + e * 0.7;
    }

    static char findGrades(double m) {
        if (m >= 75) return 'A';
        if (m >= 60) return 'B';
        if (m >= 50) return 'C';
        return 'F';
    }

    static void printDetails(String n, double m, char g) {
        System.out.println(n + "\t" + m + "\t" + g);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name\tFinal Mark\tGrade");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Assignment: ");
            double a = sc.nextDouble();

            System.out.print("Exam: ");
            double e = sc.nextDouble();

            double mark = calcFinalMark(a, e);
            char grade = findGrades(mark);

            printDetails(name, mark, grade);
        }
    }
}