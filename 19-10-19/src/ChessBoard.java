class ChessBoard extends Board {
	
	Piece[][] spaces = new Piece[height][width];
	
	class NewGame{

		void KillAllPieces(Piece[][] spaces) {
			for (int i = 0; i < spaces.length; i++) {
				for (int j = 0; j < spaces[i].length; j++) {
					spaces = null;
				}
			}
		}
		void SetPieces(Piece[][] spaces) {
			//white pieces
			spaces[0][0] = new Rook(0, SimpleColors.white);
			spaces[0][1] = new Knight(1, SimpleColors.white);
			spaces[0][2] = new Bishop(2, SimpleColors.white);
			spaces[0][3] = new King(3, SimpleColors.white);
			spaces[0][4] = new Queen(4, SimpleColors.white);
			spaces[0][5] = new Bishop(5, SimpleColors.white);
			spaces[0][6] = new Knight(6, SimpleColors.white);
			spaces[0][7] = new Rook(7, SimpleColors.white);
			for (int i = 0; i < spaces.length; i++) {
				spaces[1][i] = new Pawn(8+i, SimpleColors.white);
			}
			//black pieces
			spaces[7][0] = new Rook(24, SimpleColors.black);
			spaces[7][1] = new Knight(25, SimpleColors.black);
			spaces[7][2] = new Bishop(26, SimpleColors.black);
			spaces[7][3] = new King(27, SimpleColors.black);
			spaces[7][4] = new Queen(28, SimpleColors.black);
			spaces[7][5] = new Bishop(29, SimpleColors.black);
			spaces[7][6] = new Knight(30, SimpleColors.black);
			spaces[7][7] = new Rook(31, SimpleColors.black);
			for (int i = 0; i < spaces.length; i++) {
				spaces[6][i] = new Pawn(16+i, SimpleColors.black);
			}
		}
		
		void CountPieces(Piece[][] spaces) {
			for (int i = 0; i < spaces.length; i++) {
				for (int j = 0; j < spaces[i].length; j++) {
					if(spaces[i][j] != null) {
						Piece tempPiece = new Piece();
						tempPiece = spaces[i][j];
						System.out.println("found "+tempPiece+" in "+i+", "+j+", with ID of "+tempPiece.getID());
					}
				}
			}
		}
	}
		
	public ChessBoard() {
		// TODO Auto-generated constructor stub
	}
}
