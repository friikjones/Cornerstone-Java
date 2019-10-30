public class Cat extends Animal{
	
	protected String name = "Cat";
	
	public String getName() {
		return this.name;
	}
	
	public void sleep() {
		System.out.println("They sleep on the couch.");
	}
	
	public void eat() {
		System.out.println("They eat fish.");
	}
}
