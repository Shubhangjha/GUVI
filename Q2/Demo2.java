package comA;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age:  ");
		int age = sc.nextInt();
		
		System.out.println("Enter ID:  ");
		int id = sc.nextInt();
		
		System.out.println("Enter Name:  ");
		String name = sc.next();
		
		System.out.println("Enter Salary:");
		float salary = sc.nextFloat();
		
		sc.nextLine();
		
		System.out.println("Enter Designation:");
		String designation = sc.nextLine();
		
		System.out.println("\n--- Output ---");
		System.out.println("My name is: " + name);
		System.out.println("My id is: " + id);
		System.out.println("My age is: " + age);
		System.out.println("My salary is: " + salary);
		System.out.println("My designation is: " + designation);
		
		sc.close();
	}
}
