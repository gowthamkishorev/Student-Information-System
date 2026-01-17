import java.util.Scanner;

public class StudentInformationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("=== Student Information System (Basic Version) ===");

        System.out.print("Enter Student Name: ");
        student.name = sc.nextLine();

        System.out.print("Enter Age: ");
        student.age = sc.nextInt();

        System.out.print("Enter Mark 1: ");
        student.mark1 = sc.nextDouble();

        System.out.print("Enter Mark 2: ");
        student.mark2 = sc.nextDouble();

        System.out.print("Enter Mark 3: ");
        student.mark3 = sc.nextDouble();

        double average = student.calculateAverage();

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Average Marks: " + average);

        sc.close();
    }
}
