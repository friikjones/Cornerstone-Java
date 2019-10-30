
public class Encapsulation {

	public static void main(String[] args) {
		StudentData student = new StudentData();
		//inputs
		student.setName("Autumn Fall");
		student.setAge(25);
		student.setID("CS180430");
		student.setGender("Male");
		//printing
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getID());
		System.out.println(student.getGender());
		
	}
	


}
