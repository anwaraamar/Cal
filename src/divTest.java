import static org.junit.Assert.*;

import org.junit.Test;

public class divTest {

	@Test
	public void divtest() {
		Model mymodell = new Model();
		double result= mymodell.division_Result(2,1);
		assertTrue(result==2);
	}

}