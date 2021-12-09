

//import static org.junit.Assert.*;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.psnbtech.Game;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class testOne {
	Game gameTest = new Game();
	/*@Before
	public void setUp() throws Exception {
		//Game gameTest = new Game();
	}

	@After
	public void tearDown() throws Exception {
	}*/

	@Test
	public void test() {
		assertNotNull(gameTest.getLives());
	}

}
