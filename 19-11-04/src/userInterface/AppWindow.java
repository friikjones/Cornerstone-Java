package userInterface;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

import engine.GameManager;
import engine.PlayerHand;

import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.util.*;
import java.text.SimpleDateFormat;

public class AppWindow {

	private JFrame frame;
	private int scale = 1;
	private JLabel lblHouseDealtCard0, lblHouseDealtCard1, lblHouseDealtCard2, lblHouseDealtCard3, lblHouseDealtCard4;
	private JLabel lblPlayerDealtCard0, lblPlayerDealtCard1,lblPlayerDealtCard2,lblPlayerDealtCard3,lblPlayerDealtCard4;
	private JLabel lblHouseScore, lblPlayerScore;
	private PlayerHand player, house;
	private CardImagesLoader imagesLoader;
	private BufferedImage loadedImage;
	private Graphics2D g;
	private GameManager newGameManager;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					AppWindow window = new AppWindow();
					window.frame.setVisible(true);
					

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppWindow() {
		initialize(3);
		updateLabels();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int scale) {
		this.scale = scale;
		initialize();
	}

	private void initialize() {
		newGameManager = new GameManager();
		newGameManager.initialize(this);

		this.player = newGameManager.getPlayer();
		this.house = newGameManager.getHouse();

		frame = new JFrame();
		frame.setBounds(100, 100, 450*scale, 300*scale);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//layout
		BorderLayout layout = new BorderLayout(0,0);
		frame.getContentPane().setLayout(layout);
		//top panel
		JPanel panel_top = new JPanel();
		frame.getContentPane().add(panel_top, BorderLayout.NORTH);
		//center panel
		JPanel panel_center = new JPanel();
		frame.getContentPane().add(panel_center, BorderLayout.CENTER);
		panel_center.setLayout(new GridLayout(2, 2, 0, 0));

		//Player Deck
		JPanel panel_player_deck = new JPanel();
		panel_center.add(panel_player_deck);

		//Player Dealt
		JPanel panel_player_dealt = new JPanel();
		panel_center.add(panel_player_dealt);
		panel_player_dealt.setLayout(new GridLayout(5, 1, 0, 0));

		lblPlayerDealtCard0 = new JLabel(" ");
		//lblHouseDealtCard1.setFont(new Font("Tahoma", Font.PLAIN, 45));
		panel_player_dealt.add(lblPlayerDealtCard0);
		lblPlayerDealtCard1 = new JLabel(" ");
		//lblHouseDealtCard1.setFont(new Font("Tahoma", Font.PLAIN, 45));
		panel_player_dealt.add(lblPlayerDealtCard1);
		lblPlayerDealtCard2 = new JLabel(" ");
		//lblHouseDealtCard1.setFont(new Font("Tahoma", Font.PLAIN, 45));
		panel_player_dealt.add(lblPlayerDealtCard2);
		lblPlayerDealtCard3 = new JLabel(" ");
		//lblHouseDealtCard1.setFont(new Font("Tahoma", Font.PLAIN, 45));
		panel_player_dealt.add(lblPlayerDealtCard3);
		lblPlayerDealtCard4 = new JLabel(" ");
		//lblHouseDealtCard1.setFont(new Font("Tahoma", Font.PLAIN, 45));
		panel_player_dealt.add(lblPlayerDealtCard4);

		//House Deck
		JPanel panel_house_deck = new JPanel();
		panel_center.add(panel_house_deck);

		//House Dealt
		JPanel panel_house_dealt = new JPanel();
		panel_center.add(panel_house_dealt);
		panel_house_dealt.setLayout(new GridLayout(0, 1, 0, 0));
		panel_house_dealt.setVisible(true);

		//lblHouseDealtCard0 = new JLabel(new ImageIcon());
		lblHouseDealtCard0 = new JLabel(" ");
		//lblHouseDealtCard1.setFont(new Font("Tahoma", Font.PLAIN, 45));
		panel_house_dealt.add(lblHouseDealtCard0);

		//lblHouseDealtCard1 = new JLabel(new ImageIcon());
		lblHouseDealtCard1 = new JLabel(" ");
		//lblHouseDealtCard1.setFont(new Font("Tahoma", Font.PLAIN, 45));
		panel_house_dealt.add(lblHouseDealtCard1);

		//lblHouseDealtCard2 = new JLabel(new ImageIcon());
		lblHouseDealtCard2 = new JLabel(" ");
		//lblHouseDealtCard1.setFont(new Font("Tahoma", Font.PLAIN, 45));
		panel_house_dealt.add(lblHouseDealtCard2);

		//lblHouseDealtCard3 = new JLabel(new ImageIcon());
		lblHouseDealtCard3 = new JLabel(" ");
		//lblHouseDealtCard1.setFont(new Font("Tahoma", Font.PLAIN, 45));
		panel_house_dealt.add(lblHouseDealtCard3);

		//lblHouseDealtCard4 = new JLabel(new ImageIcon());
		lblHouseDealtCard4 = new JLabel(" ");
		//lblHouseDealtCard1.setFont(new Font("Tahoma", Font.PLAIN, 45));
		panel_house_dealt.add(lblHouseDealtCard4);

		//down panel
		JPanel panel_down = new JPanel();
		frame.getContentPane().add(panel_down, BorderLayout.SOUTH);
		//left panel
		JPanel panel_left = new JPanel();
		frame.getContentPane().add(panel_left, BorderLayout.WEST);
		//right panel
		JPanel panel_right = new JPanel();
		frame.getContentPane().add(panel_right, BorderLayout.EAST);
		panel_right.setLayout(new GridLayout(2, 1, 0, 0));
		//right up panel
		JPanel panel_right_up = new JPanel();
		panel_right.add(panel_right_up);
		panel_right_up.setLayout(new GridLayout(2, 0, 0, 0));

		lblPlayerScore = new JLabel("Player: ");
		panel_right_up.add(lblPlayerScore);

		lblHouseScore = new JLabel("House: ");
		panel_right_up.add(lblHouseScore);
		//right down panel
		JPanel panel_right_down = new JPanel();
		panel_right.add(panel_right_down);
		panel_right_down.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel placeholder_top = new JPanel();
		panel_right_down.add(placeholder_top);
		placeholder_top.setLayout(new GridLayout(0, 2, 200, 0));

		JPanel panel_buttons = new JPanel();
		panel_right_down.add(panel_buttons);
		panel_buttons.setLayout(null);

		JButton btnHitMe = new JButton("Hit Me!");
		btnHitMe.setBounds(0, 81, 100, 50);
		btnHitMe.setActionCommand("HitMe");
		btnHitMe.addActionListener(newGameManager);
		panel_buttons.add(btnHitMe);
		JButton btnImOk = new JButton("I'm OK.");
		btnImOk.setBounds(100, 81, 100, 50);
		btnImOk.setActionCommand("ImOk");
		btnImOk.addActionListener(newGameManager);
		panel_buttons.add(btnImOk);
		//menu bar
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		//menu
		JMenu mnGameMenu = new JMenu("Game");
		menuBar.add(mnGameMenu);
		//menu item
		JMenuItem mntmNewGame = new JMenuItem("New Game");
		mnGameMenu.add(mntmNewGame);
	}

	public void updateLabels() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
		System.out.println("update labels: "+ formatter.format(date));
		lblPlayerScore.setText("Player scores "+player.currentHandValueBlackjack());
		if(newGameManager.gameOver) {
			lblHouseScore.setText("House scores "+house.currentHandValueBlackjack());
		}else {
			lblHouseScore.setText("House scores [Hidden]");
		}
		imagesLoader = new CardImagesLoader();
		//update labels for house and player cards
		for (int i = 0; i < 5; i++) {
			switch (i) {
			case 0:
				if(i < house.getHandSize()) {
					loadedImage = imagesLoader.returnImageForCard(house.getCardsInHand()[i].getValue(), house.getCardsInHand()[i].getSuite());
					g = (Graphics2D) loadedImage.getGraphics();
					g.setStroke(new BasicStroke(3));
					g.setColor(Color.BLUE);
					g.drawRect(10, 10, loadedImage.getWidth() - 20, loadedImage.getHeight() - 20);
					lblHouseDealtCard0 = new JLabel(new ImageIcon(loadedImage));
					lblHouseDealtCard0.setText(house.getCardsInHand()[i].cardPrintOut());
					
					if(house.getCardsInHand()[i].getFaceUp()) {
						lblHouseDealtCard0.setText(house.getCardsInHand()[i].cardPrintOut());
					}else {
						lblHouseDealtCard0.setText("[Hidden]");
					}
				}
				if(i < player.getHandSize())
					lblPlayerDealtCard0.setText(player.getCardsInHand()[i].cardPrintOut());
				break;
			case 1:
				if(i < house.getHandSize()){
					loadedImage = imagesLoader.returnImageForCard(house.getCardsInHand()[i].getValue(), house.getCardsInHand()[i].getSuite());
					//lblHouseDealtCard1 = new JLabel(new ImageIcon(loadedImage));
					lblHouseDealtCard1.setText(house.getCardsInHand()[i].cardPrintOut());
					}
				if(i < player.getHandSize())
					lblPlayerDealtCard1.setText(player.getCardsInHand()[i].cardPrintOut());
				break;
			case 2:
				if(i < house.getHandSize()){
					loadedImage = imagesLoader.returnImageForCard(house.getCardsInHand()[i].getValue(), house.getCardsInHand()[i].getSuite());
					//lblHouseDealtCard2 = new JLabel(new ImageIcon(loadedImage));
					lblHouseDealtCard2.setText(house.getCardsInHand()[i].cardPrintOut());
					}
				if(i < player.getHandSize())
					lblPlayerDealtCard2.setText(player.getCardsInHand()[i].cardPrintOut());
				break;
			case 3:
				if(i < house.getHandSize()){
					loadedImage = imagesLoader.returnImageForCard(house.getCardsInHand()[i].getValue(), house.getCardsInHand()[i].getSuite());
					//lblHouseDealtCard3 = new JLabel(new ImageIcon(loadedImage));
					lblHouseDealtCard3.setText(house.getCardsInHand()[i].cardPrintOut());
					}
				if(i < player.getHandSize())
					lblPlayerDealtCard3.setText(player.getCardsInHand()[i].cardPrintOut());
				break;
			case 4:
				if(i < house.getHandSize()){
					loadedImage = imagesLoader.returnImageForCard(house.getCardsInHand()[i].getValue(), house.getCardsInHand()[i].getSuite());
					//lblHouseDealtCard4 = new JLabel(new ImageIcon(loadedImage));
					lblHouseDealtCard4.setText(house.getCardsInHand()[i].cardPrintOut());
					}
				if(i < player.getHandSize())
					lblPlayerDealtCard4.setText(player.getCardsInHand()[i].cardPrintOut());
				break;

			default:
				break;
			}
		}
	}
}





