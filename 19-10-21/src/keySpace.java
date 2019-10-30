
public class keySpace {

	private String keySpace;
	
	public String getKeySpace() {
		return keySpace;
	}
	public void setKeySpace(String keySpace) {
		this.keySpace = keySpace;
	}
	public void printOut() {
		System.out.println("key space: "+keySpace);
	}
	public void setInitialValue(Boolean upper, Boolean lower, Boolean numbers) {
		keySpace = "";
		if(upper) {
			for (int i = 65; i <= 90; i++) {
				keySpace += (char)i;
			}
		}
		if(lower) {
			for (int i = 97; i <= 122; i++) {
				keySpace += (char)i;
			}
		}
		if(numbers) {
			for (int i = 48; i <= 57; i++) {
				keySpace += (char)i;
			}
		}
	}
	public char[] getKeySpaceArray() {
		char[] tempArray = new char[keySpace.length()];
		tempArray= keySpace.toCharArray();
		return tempArray;
	}
	public void printOutArray() {
		char[] tempArray = new char[keySpace.length()];
		tempArray = getKeySpaceArray();
		System.out.println("key space in array form: ");
		for (int i = 0; i < tempArray.length; i++) {
			System.out.print(tempArray[i]);
			if(i != tempArray.length-1)
				System.out.print(",");
		}
		System.out.println();
	}

}
