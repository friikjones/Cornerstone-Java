import java.util.Scanner;

public class sieveOfEratosthenes {
	
	
	public static void main(String[] args) {

		int limit = 10;	
		
		Scanner input = new Scanner(System.in);
		limit = input.nextInt();
		
		boolean[] primeArray = new boolean [limit];
		arrayInitialStateSet(primeArray);
		primeNumberFinder(limit, primeArray);
		int primeCount = primeCounter(primeArray);
		arrayPrinter(primeArray, primeCount, limit);
	}
	
	public static void primeNumberFinder(int limit, boolean[] array) {
		int i = 2;
		//System.out.println("starting i: "+i);
		while(i*i < limit) {
			//System.out.println("running i: "+i);
			for (int j = i*2; j < array.length; j+=i) {
				//System.out.println("found: "+j);
				array[j] = false;
			}
			i++;
		}
	}
	
	public static void arrayInitialStateSet(boolean[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = true;
		}
	}
	
	public static int primeCounter(boolean[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i])
				count++;
		}
		return count;
	}
	
	public static void arrayPrinter(boolean[] array, int count, int limit) {
		if(limit <= 900_000) {
			System.out.println("The primes are:");
			String output = "";
			for (int i = 0; i < array.length; i++) {
				if(array[i])
					output += (i+", ");
			}
			output = output.substring(0, output.length()-2);
			System.out.println(output);	
		}System.out.println("There were "+count+" prime numbers in the specified interval.");
	}
}
