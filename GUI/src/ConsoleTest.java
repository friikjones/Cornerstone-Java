
public class ConsoleTest {
	
	public void Test_BackEnd_AddToBoard() {
		TTTBackEnd backEnd = new TTTBackEnd(3);
		System.out.println("Adding to board");
		System.out.println("X, x=0, y=0");
		backEnd.addToBoard(0, 0, 'X');
		backEnd.printToConsole();
	}
	
	public void TestConsoleGame() {
		TTTBackEnd backEnd = new TTTBackEnd(3);
		backEnd.initializeBoard();
		backEnd.addToBoard(0, 0, 'X');
		backEnd.addToBoard(0, 1, 'O');
		backEnd.addToBoard(0, 2, 'X');
		backEnd.addToBoard(1, 0, 'O');
		backEnd.addToBoard(1, 1, 'X');
		backEnd.addToBoard(1, 2, 'O');
		backEnd.addToBoard(2, 0, 'X');
		backEnd.addToBoard(2, 1, 'O');
		backEnd.addToBoard(2, 2, 'O');
		backEnd.printToConsole();
		System.out.println(backEnd.victoryConditionAchieved());
		System.out.println(backEnd.getWinner());
		backEnd.initializeBoard();
		backEnd.addToBoard(0, 0, 'X');
		backEnd.addToBoard(0, 1, 'O');
		backEnd.addToBoard(0, 2, 'X');
		backEnd.addToBoard(1, 0, 'X');
		backEnd.addToBoard(1, 1, 'O');
		backEnd.addToBoard(1, 2, 'X');
		backEnd.addToBoard(2, 0, 'O');
		backEnd.addToBoard(2, 1, 'X');
		backEnd.addToBoard(2, 2, 'O');
		backEnd.printToConsole();
		System.out.println(backEnd.victoryConditionAchieved());
		System.out.println(backEnd.getWinner());
		backEnd.initializeBoard();
		System.out.println(backEnd.victoryConditionAchieved());
	}

}
