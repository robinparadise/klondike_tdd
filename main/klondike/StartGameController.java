package klondike;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class StartGameController {
	
	public static final int FOUNDATIONS = 4;
	public static final int TABLEAUS = 7;
    public static final int DECK = 24;

	private int deck = DECK;
	private Stack<Card> waste = new Stack<Card>();
	private ArrayList<Stack<Card>> foundations;
	
	public StartGameController() {
		this.foundations = new ArrayList<Stack<Card>>(FOUNDATIONS);
		for(int i = 0; i < FOUNDATIONS; i++){
			foundations.add(new Stack<Card>());
		}
	}

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

	public Stack<Card> getFoundation(int foundation){
		return this.foundations.get(foundation);
	}

	public void addFoundation(int i, Card card) {
		this.getFoundation(i).add(card);
	}

	public Card removeWaste() {
		return this.waste.pop();
	}

	public void addTableau(int i, Card card) {
		// TODO Auto-generated method stub
		
	}

	public Vector<Card> getTableau(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
