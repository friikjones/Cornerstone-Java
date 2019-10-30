public class Dog extends Animal{
	
	protected String name = "Dog";
	
	public String getName() {
		return this.name;
	}
	
	public void sleep() {
		System.out.println("They sleep with their owner.");
	}
	
	public void eat() {
		System.out.println("They eat dog food.");
	}
}
