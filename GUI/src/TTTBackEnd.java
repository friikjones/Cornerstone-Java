
public class TTTBackEnd {
	private char[][] gameBoard;
	private int size;
	private char currentTurn;
	private char winner;
	private char initialChar = ' ';

	//MODEL
	public TTTBackEnd(int size) {
		this.size = size;
	}

	public void setGameBoard(char[][] gameBoard) {
		this.gameBoard = gameBoard;
	}
	
	public void setInitialValue(char input) {
		this.initialChar = input;
	}

	//VIEW
	public char[][] getGameBoard() {
		return gameBoard;
	}

	public char getWinner() {
		return winner;
	}

	public void printToConsole() {
		System.out.println("Printing the gameBoard");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(gameBoard[i][j]);
			}
			System.out.println();
		}
	}

	//CONTROLLER
	//Needs to be initialized first
	public void initializeBoard() {
		char[][] initializedBoard = new char[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				initializedBoard[i][j] = initialChar;
			}
		}
		gameBoard = initializedBoard;
		currentTurn = 'X';
		winner = '\0';
	}

	public void addToBoard(int i, int j, char input) {
		gameBoard[i][j] = input;
	}

	public char whoseTurnItIs() {
		if(currentTurn == 'X') {
			currentTurn = 'O';
			return 'X';
		}else {
			currentTurn = 'X';
			return 'O';
		}
	}

	public boolean victoryConditionAchieved() {
		char checkingPlayer = initialChar;
		//checking vertically
		for (int i = 0; i < size; i++) {
			if(gameBoard[i][0] != initialChar) {
				checkingPlayer = gameBoard[i][0];
				if(gameBoard[i][1] == checkingPlayer) {
					if (gameBoard[i][2] == checkingPlayer) {
						winner = checkingPlayer;
						return true;
					}
				}
			}
		}
		//checking horizontal
		for (int i = 0; i < size; i++) {
			if(gameBoard[0][i] != initialChar) {
				checkingPlayer = gameBoard[0][i];
				if(gameBoard[1][i] == checkingPlayer) {
					if (gameBoard[2][i] == checkingPlayer) {
						winner = checkingPlayer;
						return true;
					}
				}
			}
		}
		//checking diagonal top-left to bottom-right
		if(gameBoard[0][0] != initialChar) {
			checkingPlayer = gameBoard[0][0];
			if(gameBoard[1][1] == checkingPlayer) {
				if (gameBoard[2][2] == checkingPlayer) {
					winner = checkingPlayer;
					return true;
				}
			}
		}
		//checking diagonal top-right to bottom-left
		if(gameBoard[0][2] != initialChar) {
			checkingPlayer = gameBoard[0][2];
			if(gameBoard[1][1] == checkingPlayer) {
				if (gameBoard[2][0] == checkingPlayer) {
					winner = checkingPlayer;
					return true;
				}
			}
		}
		//write winner on winner
		return false;
	}



}
