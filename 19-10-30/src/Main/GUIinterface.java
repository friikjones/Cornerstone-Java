package Main;
import javax.swing.*;

public class GUIinterface {

	//private CalcButton buttons[];
	private JFrame frame;

	public static void main(String[] args) {
		JFrame frame = new JFrame("My First GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,800);
		CalcButton[] buttons = new CalcButton[8];
		initializeCommandButtons(buttons, frame);
		// Adds Button to content pane of frame
		frame.setLayout(null);
		frame.setVisible(true);
	}

	//Initializing command Buttons
	public static void initializeCommandButtons(CalcButton[] buttons, JFrame frame) {
		buttons = new CalcButton[8];
		for (int i = 0; i < buttons.length; i++) {
			switch (i) {
			case 0:
				buttons[i] = new CalcButton("+");
				break;
			case 1:
				buttons[i] = new CalcButton("-");
				break;
			case 2:
				buttons[i] = new CalcButton("*");
				break;
			case 3:
				buttons[i] = new CalcButton("/");
				break;
			case 4:
				buttons[i] = new CalcButton("^2");
				break;
			case 5:
				buttons[i] = new CalcButton("^1/2");
				break;
			case 6:
				buttons[i] = new CalcButton("^");
				break;
			case 7:
				buttons[i] = new CalcButton("^-1");
				break;
			default:
				break;
			}
			buttons[i].setID(i);
			buttons[i].setWidthnHeight(100, 50);
			buttons[i].setXnY(500, 50*i);

		}
		for (int i = 0; i < buttons.length; i++) {
			frame.getContentPane().add(buttons[i]);
		}

	}

}