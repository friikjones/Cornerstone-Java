package Handler;

public class CommandLine {

	private String[] arguments = new String[0];
	
	public CommandLine(String[] arguments)
	{
		this.arguments = new String[arguments.length];
		for (int i = 0; i < arguments.length; i++) {
			this.arguments[i] = arguments[i]; 
		}
	}
	
	
	public boolean doesArgumentExists(String argument) {
		for (int i = 0; i < argument.length(); i++) {
			if(this.arguments[i] == argument) {
				return true;
			}
		}
		return false;
	}
	
	public int getArgumentIndex(String argument) {
		for (int i = 0; i < argument.length(); i++) {
			if(this.arguments[i] == argument)
				return i;
		}
		return -1;
	}
	
	
	
}
