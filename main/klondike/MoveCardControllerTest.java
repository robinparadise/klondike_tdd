package klondike;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoveCardControllerTest {

	StartGameController gameController;
	MoveCardController moveCardController;

	@Before
	public void before() {
		gameController = new StartGameController();
		moveCardController = new MoveCardController(gameController);
	}

	@Test
	public void moveCardFromDeckToWasteTest() {
		int sizeDeck = gameController.sizeDeck();
		int sizeWaste = gameController.sizeWaste();
		moveCardController.moveFromDeckToWaste();
		assertEquals(gameController.sizeDeck(), (sizeDeck - 3));
		assertEquals(gameController.sizeWaste(), (sizeWaste + 3));
	}
	
	@Test
	public void moveCardFromDeckToWasteLessThan3CardsTest() {
		int sizeDeck = 2;
		gameController.setDeck(sizeDeck);
		moveCardController.moveFromDeckToWaste();
		assertEquals(gameController.sizeDeck(), 0);
		assertEquals(gameController.sizeWaste(), sizeDeck);
	}

}
