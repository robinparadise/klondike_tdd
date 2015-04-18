package klondike;

import static org.junit.Assert.*;

import java.util.Stack;

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
	
	@Test
	public void moveCardFromWasteToFoundationTest() {
		gameController.addWaste(new Card());
		gameController.addFoundation(1, new Card());
		Stack<Card> foundation = gameController.getFoundation(1);
		int foundationSize = foundation.size();
		int sizeWaste = gameController.sizeWaste();
		moveCardController.moveFromWasteToFoundation(1);
		assertEquals(sizeWaste - 1, gameController.sizeWaste());
		assertEquals(foundationSize + 1, gameController.getFoundation(1).size());
	}
	
	
	@Test
	public void moveCardFromWasteToTableauTest() {
		gameController.addWaste(new Card());
		gameController.addTableau(1, new Card());
		moveCardController.moveFromWasteToTableau(1);
		assertEquals(2, gameController.getTableau(1).size());
		assertEquals(0, gameController.sizeWaste());
	}

}
