package CRAZY8game;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cardgame.Card.Rank;

public class GameEngine {
	List<Card> start(List<Card> deck, Player1 play1, Player2 play2) {
		int i;
		List<Card> player1=new ArrayList<>();
		List<Card> player2=new ArrayList<>();
		for(i=0;i<14;i++) {
			if(i%2==0)
				player2.add(deck.get(0));
			else 
				player1.add(deck.get(0));
			deck.remove(0);			
		}
		System.out.println();
		System.out.println("Player1 Cards : ");
		for(i=0;i<player1.size();i++) {
			System.out.print(player1.get(i).getRank()+" "+player1.get(i).getSuit()+" ");
		}
		System.out.println("Player2 Cards : ");
		for(i=0;i<player2.size();i++) {
			System.out.print(player2.get(i).getRank()+" "+player2.get(i).getSuit()+" ");
		}
		System.out.println();
		play1.receiveInitialCards(player1);
		play2.receiveInitialCards(player2);
		return deck;
	}
	
	void play(List<Card> deck, Player1 play1, Player2 play2) {
		Game ob=new Game();
		int point1=0,i,point2=0;
		Card topCard;
		topCard=deck.get(0);
		deck.remove(0);
		System.out.println("TopCard : "+topCard.getRank()+" "+topCard.getSuit());
		Card.Suit decCard=null;
		while(point1<200&&point2<200) {
			for(i=0;i<3;i++) {
				if(play2.shouldDrawCard(topCard, decCard)) {
					if(deck.size()!=0) {
						play2.receiveCard(deck.get(0));		
						deck.remove(0);			
					}
				}
				else {
					topCard=play2.playCard();
					System.out.println("TopCard : "+topCard.getRank()+" "+topCard.getSuit());
					if(topCard.getRank()==Rank.EIGHT&&play2.myCards.size()!=0) {
						decCard=play2.declareSuit();
					}
					break;
				}
			}
			for(i=0;i<3;i++) {
				if(play1.shouldDrawCard(topCard, decCard)) {
					if(deck.size()!=0) {
						play1.receiveCard(deck.get(0));	
						deck.remove(0);
						
					}
				}0.
				else {
					topCard=play1.playCard();
					System.out.println("TopCard : "+topCard.getRank()+" "+topCard.getSuit());
					if(topCard.getRank().equals(Rank.EIGHT)&&play1.myCards.size()!=0) {
						decCard=play1.declareSuit();
					}
					break;
				}
			}
			if(play1.myCards.size()==0||deck.size()==0) {
				point2+=play2.getScore();
				System.out.println("player2 :"+point2);
			}
			if(play2.myCards.size()==0||deck.size()==0) {
				point1+=play1.getScore();
				System.out.println("player1 :"+point1);
			}
			if(deck.size()==0&&point1<200&&point2<200) {
				deck=Card.getDeck();
				Collections.shuffle(deck);
				deck=ob.start(deck,play1,play2);
			}
		}
		ob.results(point1,point2);
	}
	
	void results(int p1,int p2) {
		if(p1>=200) {
			System.out.println("player2 wins");
		}
		else if(p2>=200) {
			System.out.println("player1 wins");
		}
	}

}
