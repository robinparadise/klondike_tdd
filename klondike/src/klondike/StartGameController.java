package klondike;

import java.util.ArrayList;
import java.util.Stack;

public class StartGameController {

	public int sizeWaste() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ArrayList<Integer> sizeFoundations() {
		ArrayList<Integer> sizeFoundations = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++) {
			sizeFoundations.add(0);
		}
		return sizeFoundations;
	}

	public int sizeDesk() {
		// TODO Auto-generated method stub
		return 24;
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

}
