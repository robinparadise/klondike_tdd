package klondike;

import java.util.ArrayList;
import java.util.Stack;

public class StartGameControllerTest {

	private StartGameController startGameController;

	@Before
	public void before() {
		startGameController = new StartGameController();
	}

	@Test
	public void sizeWasteTest() {
		assertEquals(startGameController.sizeWaste(), 0);
	}

	@Test
	public void sizeFoundationsTest() {
		ArrayList<Integer> sizeFoundations = startGameController
				.sizeFoundations();
		assertEquals(4, sizeFoundations.size());
		for (int sizeFoundation : startGameController.sizeFoundations()) {
			assertEquals(0, sizeFoundation);
		}
	}

	@Test
	public void sizeDeckTest() {
		assertEquals(startGameController.sizeDesk(), 24);
	}

	@Test
	public void sizeTableausTest() {
		ArrayList<Integer> sizeTableaus = startGameController
				.sizeCoveredCardsTableaus();
		ArrayList<Stack<Card>> uncoveredCardsStackTableaus = startGameController
				.uncoveredCardsStackTableau();

		assertEquals(7, sizeTableaus.size());
		assertEquals(7, uncoveredCardsStackTableaus.size());

		for (int i = 0; i < sizeTableaus.size(); i++) {
			assertEquals(new Integer(i + 1), sizeTableaus.get(i));
		}

		for (Stack<Card> uncoveredCardsStack : uncoveredCardsStackTableaus) {
			assertEquals(1, uncoveredCardsStack.size());
			assertTrue(uncoveredCardsStack.peek().uncovered());
		}

	}

}
