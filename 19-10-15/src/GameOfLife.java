import java.util.Scanner;

public class GameOfLife {

	private static int height = 25;
	private static int width =25;
	//private static int loops = 100;
	private static String liveCell = " # ";
	private static String deadCell = "   ";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] grid = new boolean [height][width];

		Scanner input = new Scanner(System.in);

		System.out.println("Do you want to run with a random grid(1) or custom grid(2)? (Default: Random)");
		String cmd = input.next();
		
		switch (cmd) {
		case "1":
			generateRandomGrid(grid);
			break;
		case "2":
			generateCustomGrid(grid);
			break;

		default:
			generateRandomGrid(grid);
			break;
		}
		// Initializing
		showCurrentGrid(grid);
		// Loops
		while(true) {
			System.out.println("Type anything to run next iteration, or type 'exit' to break.");
			cmd = input.next();
			if(cmd.contains("exit"))
				break;
			clearScreen();
			nextGeneration(grid);
			showCurrentGrid(grid);
		}
		input.close();
	}
	
	public static void showCurrentGrid(boolean[][] grid) {
		for (int i= 0; i<grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {		
				//System.out.print((grid[i][j]) ? ("\u2588\u2588") : "  ");
				System.out.print((grid[i][j]) ? liveCell : deadCell);
			}System.out.println();
		}System.out.println("---------------------------------------------");
	}
	
	public static void generateRandomGrid(boolean[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j]= Math.random() < 0.5; 
			}
		}
	}
	
	public static void nextGeneration(boolean[][] grid) {
		boolean[][] future = new boolean[height][width];
		
		for (int i = 0; i < grid.length-1; i++) {
			for (int j = 0; j < grid[i].length-1; j++) {
				int neighbours = checkAliveNeighbours(grid, i, j);
				//System.out.print("neigh: "+neighbours+", ");
				//System.out.println("grid: "+grid[i][j]);
				future[i][j] = checkFutureSelf(grid[i][j], neighbours);
				//System.out.println("future: "+grid[i][j]);
			}
		}
		
		for (int i = 0; i < future.length; i++) {
			for (int j = 0; j < future.length; j++) {
				grid[i][j]= future[i][j]; 
			}
		}
	}
	
	public static int checkAliveNeighbours(boolean[][] grid, int i, int j) {
		int output = 0;
		for (int k = -1; k <= 1; k++) {
			for (int k2 = -1; k2 <= 1; k2++) {
				try {
					if(k==0 && k2==0) {
						continue;
					}else if(grid[k+i][k2+j]) {
						output++;
					}
				}
				catch(ArrayIndexOutOfBoundsException exception) {
				    continue;
				}
			}
		}
		//System.out.println("i: "+i+", j: "+j);
		//System.out.println("grid: "+grid[i][j]);
		//System.out.println("count: "+output);
		return output;
	}
	
	public static boolean checkFutureSelf(boolean gridPosition, int neighbours) {
		boolean output = gridPosition;
		//System.out.print("grid: "+gridPosition+",");
		//System.out.println("neigh: "+neighbours);
		
		if(gridPosition && neighbours<2) {
			//System.out.println("false");
			return false;	
		}
		if(gridPosition && (neighbours==3 || neighbours==2)){
			//System.out.println("true");
			return true;
		}
		if(gridPosition && neighbours>3){
			//System.out.println("false");
			return false;	
		}
		if(!gridPosition && neighbours==3){
			//System.out.println("true");
			return true;
		}
		
		return output;
	}

	public static void generateCustomGrid(boolean[][] grid) {

		boolean[][] future = {{false,false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false,false},
				{false,true,true,true,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false,false}};
		for (int i = 0; i < future.length; i++) {
			for (int j = 0; j < future.length; j++) {
				grid[i][j]= future[i][j]; 
			}
		}
	}
	
	public static void clearScreen() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
			
		}
	}
}
