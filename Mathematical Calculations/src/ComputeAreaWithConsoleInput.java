import java.util.Scanner;
public class ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);	// created scanner object
		
		System.out.print("Enter radius value: ");
		double radius = scan.nextDouble();
		
		double area = radius * radius * 3.1416;
		
		System.out.println("The area is: " + area);
	}

}
