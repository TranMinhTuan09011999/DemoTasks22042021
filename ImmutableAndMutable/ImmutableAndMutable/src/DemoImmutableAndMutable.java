import java.util.Scanner;

public class DemoImmutableAndMutable {
	public static void main(String[] args) {
		ImmutableClass student = new ImmutableClass("Tran", "Tuan");
        MutableClass student1 = new MutableClass("Tran", "Tan");
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------- Demo ImmitableClass ---------- ");
        System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
        System.out.println("--------- Demo MutableClass ---------- ");
        System.out.println("Name: " + student1.getFirstName() + " " + student1.getLastName());
        System.out.print("Please enter new first name here: ");
        String newFirstName = scanner.nextLine();
        student1.setFirstName(newFirstName);
        System.out.print("Please enter new last name here: ");
        String newLastName = scanner.nextLine();
        student1.setLastName(newLastName);
        System.out.println("Name: " + student1.getFirstName() + " " + student1.getLastName());
        scanner.close();
	}
}
