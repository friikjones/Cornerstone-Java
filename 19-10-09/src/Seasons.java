import java.util.ArrayList;

public class Seasons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> seasons = new ArrayList<String>();
		
		seasons.add("Spring");
		seasons.add("Summer");
		seasons.add("Fall");
		seasons.add("Winter");
		
		for(String s : seasons) {
			System.out.println(s);
		}
		
		seasons.set(2, "Autumn");
		
		for(String s : seasons) {
			System.out.println(s);
		}
		
	}
}
