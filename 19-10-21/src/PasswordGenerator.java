
public class PasswordGenerator {
	
	public static void main(String[] args) {

		int size = 3;
		keySpace keySpace = new keySpace();
		keySpace.setKeySpace("ABCDEFGHijklmnopqjuhjmm");
		keySpace.printOut();
		//keySpace.setInitialValue(true, false, true);
		//keySpace.printOut();
		keySpace.printOutArray();
		
		keyList keyList = new keyList(size, keySpace.getKeySpace());
		keyList.setKeySpaceArray(keySpace.getKeySpaceArray());
		
		keyList.generateList();	
		keyList.printOut();
		
		passwordCompare passwordCompare = new passwordCompare(size, keySpace.getKeySpace());
		passwordCompare.generateTarget();
		passwordCompare.printPassword();
		
	}	
}
