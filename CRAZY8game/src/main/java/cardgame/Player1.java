package cardgame;

import java.util.ArrayList;
import java.util.List;

import cardgame.Card.Suit;

public class Player1 implements PlayerStrategy {

	public int playerid;
	public int opponentid;
	private List<Card>player1_cards=new ArrayList<>();

		@Override
	public void init(int playerId, int opponentId) {
			this.playerid =playerId;
			this.opponentid =opponentId;
	}

	@Override
	public void receiveInitialCards(List<Card> cards) {
		player1_cards=cards;
	}

	@Override
	public boolean shouldDrawCard(Card topPileCard, Suit changedSuit) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void receiveCard(Card drawnCard) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Card playCard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Suit declareSuit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void processOpponentActions(List<PlayerTurn> opponentActions) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}
	
}
