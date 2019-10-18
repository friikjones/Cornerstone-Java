import java.util.Scanner;
import java.text.NumberFormat;

public class Mortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);  // Create a Scanner object
		
		//defining final variables
		
		int principal = 0;
		float monthlyInterest = 0;
		int numberOfPayments = 0;
		
		//input principal
		while(true) {
			System.out.print("Principal: ");
			principal = input.nextInt();
			if(principal >= 1_000 && principal <= 1_000_000)
				break;
			System.out.println("Input a number between 1.000 and 1.000.000");
		}
		
		//input rate
		while(true) {
			System.out.print("Annual interest rate: ");
			float rate = input.nextFloat();
			if(rate >= 1 && rate <= 30) {
				monthlyInterest = rate / 100 / 12;
				break;
			}
			System.out.println("Input a number between 1 and 30");
		}
		
		//input years
		while(true) {
			System.out.print("Period of payments (Years):");
			byte years = input.nextByte();
			if(years >= 1 && years <= 30) {
				numberOfPayments = years * 12;
				break;
			}
			System.out.println("Input a number between 1 and 30");
		}
		
		//mortgage formula: p * r * (1+r)^n / ((1+r)^n -1)
		//double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
		double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments))/(Math.pow(1+monthlyInterest, numberOfPayments)-1);
		//NumberFormat to show currency format
		NumberFormat mortgageFormatted = NumberFormat.getCurrencyInstance();
		String result = mortgageFormatted.format(mortgage);
		System.out.println("Mortgage: "+result);
		input.close();
	}

}
