package junitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.psnbtech.Game;

public class testOne {
	Game gameTest = new Game();
	@Before
	public void setUp() throws Exception {
		//Game gameTest = new Game();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertNotNull(gameTest.getLives());
	}

}
