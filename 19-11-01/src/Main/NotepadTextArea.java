package Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JTextArea;

public class NotepadTextArea extends JTextArea implements KeyListener {

	private boolean functionFlag;
	
	public NotepadTextArea() {
		// TODO Auto-generated constructor stub
		addKeyListener(this);
	}
	
	@Override
	public synchronized void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
        	if(arg0.getKeyCode()==17) {
    			functionFlag = true;
    			System.out.println("flag: "+functionFlag);
    		}
        	if(arg0.getKeyCode()==65 && arg0.getModifiers()== KeyEvent.CTRL_MASK) {
        		System.out.println("Test completed");
        	}
        }
    

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getKeyCode()==17) {
			functionFlag = false;
			System.out.println("flag: "+functionFlag);
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void toggleFunctions(char input) {
		switch (input) {
		case 'a':
			System.out.println("this is a test for a");
			break;

		default:
			break;
		}
	}
	
}
