package klondike;

import java.util.ArrayList;
import java.util.Stack;

public class StartGameController {

	private int deck = 24;
	
	private Stack<Card> waste = new Stack<Card>();

	public ArrayList<Integer> sizeFoundations() {
		ArrayList<Integer> sizeFoundations = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++) {
			sizeFoundations.add(0);
		}
		return sizeFoundations;
	}

	public int sizeDeck() {
		// TODO Auto-generated method stub
		return this.deck;
	}

	public ArrayList<Integer> sizeTableaus() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Integer> sizeCoveredCardsTableaus() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Stack<Card>> uncoveredCardsStackTableau() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDeck(int i) {
		this.deck = i;
	}

	public void addWaste(Card card) {
		this.waste.add(card);
	}
	
	public int sizeWaste() {
		return this.waste.size();
	}

	public void addFoundation() {
		// TODO Auto-generated method stub
		
	}

	public Stack<Card> getFoundation() {
		// TODO Auto-generated method stub
		return null;
	}

}
