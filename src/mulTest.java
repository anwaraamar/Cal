import static org.junit.Assert.*;

import org.junit.Test;

public class mulTest {

	@Test
	public void multest() {
		Model mymodell = new Model();
		double result= mymodell.multiply_Result(1,2);
		assertTrue(result==2);
	}

}