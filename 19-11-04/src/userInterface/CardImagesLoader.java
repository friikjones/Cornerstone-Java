package userInterface;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import engine.Suites;

public class CardImagesLoader {

	public BufferedImage returnImageForCard(int cardValue, Suites cardSuite) {
		String imagePath = "./src/assets/cards/large/card_b_";
		
		switch (cardSuite) {
		case Clubs:
			imagePath = imagePath + "c";
			break;
		case Diamonds:
			imagePath = imagePath + "d";
			break;
		case Hearts:
			imagePath = imagePath + "h";
			break;
		case Spades:
			imagePath = imagePath + "s";
			break;
		}

		switch (cardValue) {
		case 1:
			imagePath = imagePath + "a";
			break;
		case 2:
			imagePath = imagePath + "2";
			break;
		case 3:
			imagePath = imagePath + "3";
			break;
		case 4:
			imagePath = imagePath + "4";
			break;
		case 5:
			imagePath = imagePath + "5";
			break;
		case 6:
			imagePath = imagePath + "6";
			break;
		case 7:
			imagePath = imagePath + "7";
			break;
		case 8:
			imagePath = imagePath + "8";
			break;
		case 9:
			imagePath = imagePath + "9";
			break;
		case 10:
			imagePath = imagePath + "10";
			break;
		case 11:
			imagePath = imagePath + "j";
			break;
		case 12:
			imagePath = imagePath + "q";
			break;
		case 13:
			imagePath = imagePath + "k";
			break;
		}
		
		imagePath = imagePath + ".png";
		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(new File(imagePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myPicture;
		
	}
}

