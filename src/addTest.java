import static org.junit.Assert.*;

import org.junit.Test;

public class addTest {

	
	@Test
	public void addtest() {
		Model mymodell = new Model();
		double result= mymodell.summation_Result(1,2);
		assertTrue(result==3);
	}

}
