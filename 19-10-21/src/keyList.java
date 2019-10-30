import java.util.ArrayList;

public class keyList {


	private ArrayList<String> keyList;
	private int size;
	private String keySpace;
	private char[] keySpaceArray;

	public ArrayList<String> getKeysList() {
		return keyList;
	}

	public void setKeysList(ArrayList<String> keysList) {
		this.keyList = keysList;
	}

	public keyList(int size, String keySpace) {
		this.size = size;
		this.keySpace = keySpace;
	}

	public void setKeySpaceArray(char[] keySpaceArray) {
		this.keySpaceArray = keySpaceArray;
	}

	public void printOut() {
		if (keyList == null) {
			System.out.println("No itens in the list.");
		}else{
			System.out.println("List of passwords:");
			for (int i = 0; i < keyList.size(); i++) {
				System.out.println("["+i+"]"+keyList.get(i));
			}
		}
	}
	public void addToList(String input) {
		if(keyList == null) {
			keyList = new ArrayList<String>();
		}
		keyList.add(input);
	}

	public void generateList() {
		//create array of int and outputString
		int[] tempInt = new int[size];
		String outputString = "";
		keyList = new ArrayList<String>();
		//initialize array
		for (int i = 0; i < tempInt.length; i++) {
			tempInt[i]=0;
		}
		
		outputString = intToString(tempInt);
		keyList.add(outputString);
		
		double limit = Math.pow(keySpace.length(), size);
		
		for (int i = 0; i < limit-1; i++) {
			tempInt = getSucessor(tempInt);
			outputString = intToString(tempInt);
			keyList.add(outputString);
		}
		//printOutCharArray(outputString);
		
	}
	
	public int[] getSucessor(int[] currentArray) {
		int[] sucessorArray = new int[size];
		
		sucessorArray = currentArray;
		sucessorArray[sucessorArray.length-1]++;
		for (int i = sucessorArray.length-1; i > 0; i--) {
			if(sucessorArray[i] >= keySpaceArray.length) {
				sucessorArray[i] = 0;
				sucessorArray[i-1]++;
			}
		}
		
		return sucessorArray;
		
	}

	public String intToString(int[] intArray) {
		char[] tempCharArray = new char[size];
		String outputString = "";
		for (int i = 0; i < tempCharArray.length; i++) {
			tempCharArray[i] = keySpaceArray[intArray[i]];
		}
		for (int i = 0; i < tempCharArray.length; i++) {
			outputString += tempCharArray[i];
		}
		return outputString;
	}
	
	public void printOutIntArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}System.out.println();
	}
	public void printOutCharArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}System.out.println();
	}

}
