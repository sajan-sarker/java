import java.util.Scanner;
public class ComputeAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three values: ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double avg = (a + b + c) / 3;
		
		System.out.print("Average of " + a + " " + b + " " + c + " is: " + avg);
	}

}
