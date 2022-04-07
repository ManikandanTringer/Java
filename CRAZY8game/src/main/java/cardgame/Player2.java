package cardgame;

import java.util.List;

import cardgame.Card.Suit;

public class Player2 implements PlayerStrategy{


	@Override
	public void receiveInitialCards(List<Card> cards) {
		// TODO Auto-generated method stub
		
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
