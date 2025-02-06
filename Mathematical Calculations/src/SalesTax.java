import java.util.*;
public class SalesTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter purchase ammount: ");
		System.out.println();
		//double purchaseAmount = scan.nextDouble();
		double purchaseAmount = 197.55;
		
		double tax = purchaseAmount * 0.06;
		
		System.out.println("Salex tax is: " + tax);
		System.out.printf("Salex tax is: %.2f \n", tax);
		System.out.println("Salex tax is: " + (int)(tax*100)/ 100.0);
	}

}
