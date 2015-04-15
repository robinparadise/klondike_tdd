package klondike;

import java.util.Stack;

public class MoveCardController {

	private StartGameController gameController;

	public MoveCardController(StartGameController gameController) {
		this.gameController = gameController;
	}

	public void moveFromDeckToWaste() {
		int sizeDeck = gameController.sizeDeck();
		if (sizeDeck >= 3) {
			gameController.setDeck(sizeDeck - 3);
			gameController.addWaste(new Card());
			gameController.addWaste(new Card());
			gameController.addWaste(new Card());
		} else if (sizeDeck > 0) {
			gameController.setDeck(0);
			for (int i = 0; i < sizeDeck; i++) {
				gameController.addWaste(new Card());
			}
		}
	}

	public boolean moveFromWasteToFoundation(int pos) {
		Stack<Card> foundation = gameController.getFoundation(pos);
		if (foundation.size() > 0) {
			Card wasteCard = gameController.removeWaste();
			gameController.addFoundation(pos, wasteCard);
		}
		return true;
	}

}
