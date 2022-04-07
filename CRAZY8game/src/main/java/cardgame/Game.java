package cardgame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import cardgame.Card.Rank;
import cardgame.Card.Suit;
public class Game{

	public static void main(String[] args) 
	{
		
        List<Card> cardDeck = new ArrayList<>();
		cardDeck=Card.getDeck();
		Collections.shuffle(cardDeck);
		List<Card>player1_cards=new ArrayList<>();
		List<Card>player2_cards=new ArrayList<>();	
		for(int i=1;i<=14;i++)
		{
			if(i%2==0)
			{
				player2_cards.add(cardDeck.get(0));
			}
			else
			{
				player1_cards.add(cardDeck.get(0));
			}
			cardDeck.remove(0);
		}
		Player1 player1=new Player1();
		Player2 player2=new Player2();
		player1.init(1,2);
		player1.receiveInitialCards(player1_cards);
		player2.init(2,1);
		player2.receiveInitialCards(player2_cards);
		while(!cardDeck.isEmpty() && !player1_cards.isEmpty() && !player2_cards.isEmpty())
		{
			
		}
	}
}

