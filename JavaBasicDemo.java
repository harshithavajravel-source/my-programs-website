<div class="box">
    <h2>JavaBasicsDemo</h2>
    <pre>
import java.util.Scanner;

public class JavaBasicsDemo {
    public static void main(String[] args) {
        int age;
        float marks;
        double salary;
        char grade;
        boolean passed;
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Enter your marks: ");
        marks = sc.nextFloat();

        salary = 25000.50;
        grade = 'A';
        passed = true;

        System.out.println("\n----- Student Details -----");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Marks : " + marks);
        System.out.println("Salary : " + salary);
        System.out.println("Grade : " + grade);
        System.out.println("Passed : " + passed);

        System.out.println("\n----- Operators -----");
        System.out.println("Addition: " + (age + 5));
        System.out.println("Subtraction: " + (marks - 10));
        System.out.println("Multiplication: " + (age * 2));
        System.out.println("Division: " + (age / 2));
        System.out.println("Modulus: " + (age % 2));

        if (marks &gt;= 50)
            System.out.println("Pass");
        else
            System.out.println("Fail");

        switch (grade) {
            case 'A': System.out.println("Excellent"); break;
            case 'B': System.out.println("Good"); break;
            case 'C': System.out.println("Average"); break;
            default: System.out.println("Needs Improvement");
        }

        for (int i = 1; i &it;= 5; i++)
            System.out.println("Count = " + i);

        int i = 1;
        while (i &it;= 3) {
            System.out.println("Value = " + i);
            i++;
        }

        sc.close();
    }
}
    </pre>
</div>