import static org.junit.Assert.*;

import org.junit.Test;

public class sqrTest {

	@Test
	public void sqrtest() {
		Model mymodell = new Model();
		double result= mymodell.sqrt_Result(4);
		assertTrue(result==2);
	}

}