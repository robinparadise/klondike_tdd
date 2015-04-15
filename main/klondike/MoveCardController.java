package klondike;

public class MoveCardController {

	private StartGameController gameController;

	public MoveCardController(StartGameController gameController) {
		this.gameController = gameController;
	}

	public void moveFromDeckToWaste() {
		int sizeDeck = gameController.sizeDeck();
		if (sizeDeck >= 3) {
			gameController.setDeck(sizeDeck - 3);
			gameController.addWaste();
			gameController.addWaste();
			gameController.addWaste();
		} else if (sizeDeck > 0) {
			gameController.setDeck(0);
			for (int i = 0; i < sizeDeck; i++) {
				gameController.addWaste();
			}
		}
	}

}
