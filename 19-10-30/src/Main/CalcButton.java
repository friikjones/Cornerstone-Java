package Main;

import javax.swing.JButton;

public class CalcButton extends JButton {
	
	private int ID;
	private int Y;
	private int X;
	private int Height;
	private int Width;

	public CalcButton(String s) {
		super(s);
	}
	public CalcButton() {
		
	}
		
	public void setWidthnHeight(int w, int h) {
		this.Height = h;
		this.Width = w;
	}
	
	public int getY() {
		return this.Y;
	}
	
	public int getX() {
		return this.X;
	}
	
	public void setXnY(int X, int Y) {
		//calculation
		this.Y = Y;
		this.X = X;
		int top, left;
		top = X-Width/2;
		left = Y-Height/2;
		
		this.setBounds(left, top, Width, Height);
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
}
