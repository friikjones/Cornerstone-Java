package Handler;

public class Test {
	
	public static void Test_Console_RunAll(int howMany) {
		Test_Console_newLine(howMany);
		Test_Console_Print(howMany);
		Test_Console_Println(howMany);
		Test_Console_repeatChar(howMany);
		Test_Console_repeatString(howMany);		
	}
	
	public static void Test_Console_newLine(int howMany) {
		for (int i = 0; i < howMany; i++) {
			Debug.logInfo("Test_Console_newLine() - Test " + i + " - Printing " + i + " newLines");
			Console.newLine(i);
		}
	}
	
	public static void Test_Console_Print(int howMany) {
		for (int i = 0; i < howMany; i++) {
			Debug.logInfo("Test_Console_Print() - Test " + i);
			Console.print("\tTest: " + i);
		}
	}
	
	public static void Test_Console_Println(int howMany) {
		for (int i = 0; i < howMany; i++) {
			Debug.logInfo("Test_Console_Println() - Test " + i);
			Console.println("\tTest: " + i);
		}
	}
	
	public static void Test_Console_repeatChar(int howMany) {
		for (int i = 0; i < howMany; i++) {
			Debug.logInfo("Test_Console_repeatChar() - Test " + i + " will print via type casting " + i + " to its char equivalent");
			Console.repeatChar(i, (char) i);
		}
	}
	
	public static void Test_Console_repeatString(int howMany) {
		for (int i = 0; i < howMany; i++) {
			Debug.logInfo("Test_Console_repeatString() - Test " + i + " will print " + i);
			Console.repeatString(i, "\tTest: " + i );
		}
	}
	
}
