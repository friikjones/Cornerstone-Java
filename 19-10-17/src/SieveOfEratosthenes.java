import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SieveOfEratosthenes {

	private int primeCount,primeAmount;
	private int startingPosition;
	private int arraySize = 1000;
	private long[] numberArray = new long[arraySize];
	private FileWriter csvWriter;

	public static void main(String[] args) {
		SieveOfEratosthenes sieve = new SieveOfEratosthenes();
		sieve.arraySize = 1000;
		sieve.initialQuestions();
		sieve.arrayControl();
		//sieve.printArrayToConsole();
	}

	public void initialQuestions() {
		Scanner input = new Scanner(System.in);
		System.out.println("How Many Primes should I get?");
		primeAmount = input.nextInt();
		System.out.println("Where should I start?");
		startingPosition = input.nextInt();
		input.close();
		numberArray[0]= startingPosition;
	}

	public void arrayControl() {
		long lastPrime = 0;
		initializeCsv();
		int iteration = 0;
		while(primeCount < primeAmount) {
			for (int i = 1; i < arraySize; i++) {
				lastPrime = numberArray[i-1];
				numberArray[i] = nextPrime(lastPrime);
				primeCount++;
				if(primeCount == primeAmount) {
					break;
				}
			}
			iteration++;
			printStatusToConsole(iteration, lastPrime);
			//printArrayToConsole();
			savePrimesToDisk();
			resetNumberArray();
		}
	}

	public long lastPrime() {
		long lastValue = 0;
		for (int i = 1; i < arraySize; i++) {
			if(numberArray[i]== 0) {
				lastValue = numberArray[i-1];
				break;
			}
		}
		return lastValue;
	}

	public long nextPrime(long lastPrime) {
		boolean survived = true;
	    for (long i = lastPrime+1; i < 2 * lastPrime; ++i)
	    {
	    	for (long j = 2; j <= lastPrime; j++) {
	    		survived = true;
				if(i%j == 0) {
					survived = false;
					break;
				}
			}
	    	if(survived) {
	    		return i;
	    	}
	    }return 0;
		
	}

	public void printArrayToConsole() {
		for (int i = 0; i < arraySize; i++) {
			System.out.print(numberArray[i]);
			System.out.print(", ");
		}
		System.out.println();
	}
	
	public void printStatusToConsole(int iteration, long lastPrime) {
		System.out.println("Running on iteration "+iteration);
		System.out.println("Best prime so far: "+ lastPrime);
	}

	public String printArrayToString() {
		String string = "";
		for (int i = 0; i < numberArray.length; i++) {
			string += numberArray[i];
			string += ",";
		}
		return string;
	}

	public void initializeCsv() {
		try  
		{
			csvWriter = new FileWriter("output.csv");
			csvWriter.append("Primes:");
			csvWriter.append(',');
			csvWriter.flush();
			csvWriter.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void savePrimesToDisk() {
		try {
			csvWriter = new FileWriter("output.csv",true);
			csvWriter.append(printArrayToString());
			csvWriter.append(',');
			csvWriter.flush();
			csvWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void resetNumberArray() {

		long aux = numberArray[arraySize-1];
		numberArray = new long[arraySize];
		numberArray[0] = aux;
	}

}
