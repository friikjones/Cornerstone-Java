package engine;

public class HouseAI {
	
	private int currentValue;
	private PlayerHand house, player;
	
	public HouseAI(GameManager gameManager) {
		this.house = gameManager.getHouse();
		this.player = gameManager.getPlayer();
	}
	
	public boolean checkIfShouldBuy() {
		boolean output = false;
		
		//currentValue = house.currentHandValueBlackjack();
		System.out.println("house value: "+house.currentHandValueBlackjack());
		System.out.println("player value: "+player.currentHandValueBlackjack());
		if(house.currentHandValueBlackjack() < player.currentHandValueBlackjack() &&
				house.currentHandValueBlackjack() < 21 &&
				player.currentHandValueBlackjack() < 21) {
			output = true;
		}
			
		
		return output;
	}
}
