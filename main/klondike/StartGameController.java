package klondike;

import java.util.ArrayList;
import java.util.Stack;

public class StartGameController {

	public static final int FOUNDATIONS = 4;
	public static final int TABLEAUS = 7;
	public static final int DECK = 24;

	private int deck = DECK;
	private Stack<Card> waste = new Stack<Card>();
	private ArrayList<Stack<Card>> foundations;
	private ArrayList<Stack<Card>> tableaus;

	public StartGameController() {
		this.foundations = new ArrayList<Stack<Card>>(FOUNDATIONS);
		for (int i = 0; i < FOUNDATIONS; i++) {
			foundations.add(new Stack<Card>());
		}
		this.tableaus = new ArrayList<Stack<Card>>(TABLEAUS);
		for (int i = 0; i < TABLEAUS; i++) {
			tableaus.add(new Stack<Card>());
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
		ArrayList<Integer> sizeTableaus = new ArrayList<Integer>();
		for (int i = 0; i < TABLEAUS; i++) {
			sizeTableaus.add(i+1);
		}
		return sizeTableaus;
	}

	public ArrayList<Stack<Card>> uncoveredCardsStackTableau() {
		ArrayList<Stack<Card>> uncoveredCardsStackTableaus = new ArrayList<Stack<Card>>();
		for (int i = 0; i < TABLEAUS; i++) {
			Stack<Card> uncoveredCardsStack = new Stack<Card>();
			uncoveredCardsStack.add(new Card());
			uncoveredCardsStackTableaus.add(uncoveredCardsStack);
		}
		return uncoveredCardsStackTableaus;
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

	public Stack<Card> getFoundation(int foundation) {
		return this.foundations.get(foundation);
	}

	public void addFoundation(int i, Card card) {
		this.getFoundation(i).add(card);
	}

	public Card removeWaste() {
		return this.waste.pop();
	}

	public Stack<Card> getTableau(int i) {
		return this.tableaus.get(i);
	}

	public void addTableau(int i, Card card) {
		this.getTableau(i).add(card);
	}

}
