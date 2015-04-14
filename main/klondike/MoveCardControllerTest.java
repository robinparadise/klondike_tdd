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
		moveCardController = new MoveCardController();
	}

	@Test
	public void size() {
		assertEquals(false, true);
	}

}
