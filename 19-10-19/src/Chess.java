import java.util.ArrayList;

class Board {
	int height;
	int width;
}


//main



class Piece {
	private int ID;
	
	private SimpleColors color;
	
	public void die() {
		
	}
	
	public void move(int x, int y) {
		
	}

	public SimpleColors getColor() {
		return color;
	}

	public void setColor(SimpleColors color) {
		this.color = color;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	public Piece() {
		super();
	};
	
	public Piece(int ID, SimpleColors color) {
		setID(ID);
		setColor(color);
	}
}

class Pawn extends Piece {
	public Pawn(int ID, SimpleColors color) {
		setID(ID);
		setColor(color);
	}
}

class Knight extends Piece{
	public Knight(int ID, SimpleColors color) {
		setID(ID);
		setColor(color);
	}
}

class Bishop extends Piece{
	public Bishop(int ID, SimpleColors color) {
		setID(ID);
		setColor(color);
	}
}

class Rook extends Piece{
	public Rook(int ID, SimpleColors color) {
		setID(ID);
		setColor(color);
	}
}

class King extends Piece{
	public King(int ID, SimpleColors color) {
		setID(ID);
		setColor(color);
	}
}

class Queen extends Piece{
	public Queen(int ID, SimpleColors color) {
		setID(ID);
		setColor(color);
	}
}

public class Chess {

}
