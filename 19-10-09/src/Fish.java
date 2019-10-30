public class Fish extends Animal{
	
	protected String name = "Fish";
	
	public String getName() {
		return this.name;
	}
	
	public void sleep() {
		System.out.println("They sleep in the water.");
	}
	
	public void eat() {
		System.out.println("They eat plankton.");
	}
}
