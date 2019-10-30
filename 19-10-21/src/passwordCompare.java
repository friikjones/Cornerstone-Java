import java.util.ArrayList;

public class passwordCompare {
	private String passwordTarget;
	private ArrayList<String> keyList;
	private String keySpace;
	private int size;
	
	public void setKeysList(ArrayList<String> keysList) {
		this.keyList = keysList;
	}

	public passwordCompare(int size, String keySpace) {
		this.size = size;
		this.keySpace = keySpace;
	}
	
	public void setPasswordTarget(String input) {
		passwordTarget = input;
	}
	
	public void generateTarget() {
		passwordTarget = "";
		for (int i = 0; i < size; i++) {
			passwordTarget += keySpace.charAt((int)(Math.random() * ((keySpace.length()) + 1)));
		}
	}
	public void printPassword() {
		System.out.println("Current password:");
		System.out.println(passwordTarget);
	}
	
	public boolean compareToTarget() {
		
		
		
		return false;
	}
	
}
