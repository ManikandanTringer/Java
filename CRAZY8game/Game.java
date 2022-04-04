package CRAZY8game;

import java.util.*;
import cardgame.Card.*;

public class Game {
		
	public static void main(String[] args) {		
		GameEngine ob=new GameEngine();
		Player1 play1=new Player1();
		Player2 play2=new Player2();
		List<Card> deck=new ArrayList<>();
		deck=Card.getDeck();
		Collections.shuffle(deck);
		deck=ob.start(deck,play1,play2);
		ob.play(deck,play1,play2);;
		
	}
	
	
}