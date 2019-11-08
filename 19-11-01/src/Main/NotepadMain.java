package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.*;

public class NotepadMain extends JFrame implements ActionListener{

	public static NotepadMain app;
	
	public JTextArea textBox;
	public JMenuBar mnuMain;
	
	public JMenu mnuFile;
	
	
	public JMenuItem testItem;
	
	
	public NotepadMain(String s) {
		super(s);
		//size
		this.setSize(400, 400);
		//textbox
		textBox = new NotepadTextArea();
		this.add(textBox);
		textBox.setBounds(0, 0, this.getWidth(), this.getHeight());
		
	}
	
	public static void main(String[] args) {
		app = new NotepadMain("NotePad");
		app.setLayout(null);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
		app.addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent e) {
				app.textBox.setBounds(0, 0, app.getWidth(), app.getHeight());
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
