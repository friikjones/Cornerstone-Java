public class matrixTest {
	
	public static void main(String[] args) {
		int size = 4;
		int digit = 9;
		int[] array = new int[size];
		
		printAll(array, size, digit);
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}System.out.println();
	}
	
	public static int getSucessor(int[] array, int size, int digit) {
		int p = size - 1;
		while(array[p] == digit)
			p--;
		
		if(p < 0)
			return 0;
		
		array[p]= array[p] + 1;
		for(int i = p+1; i<size; i++)
			array[i] = 1;
		
		return 1;
	}
	
	public static void printAll(int[] array, int size, int digit) {
		for (int i = 0; i < digit; i++) {
			array[i] = 1;
		}
		
		while(true) {
			printArray(array);
			if(getSucessor(array, size, digit) == 0)
				break;
		}
	}
	
}
