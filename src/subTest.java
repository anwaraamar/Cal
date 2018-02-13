import static org.junit.Assert.*;

import org.junit.Test;

public class subTest {

@Test
public void subtest() {
	Model mymodell = new Model();
	double result= mymodell.subtract_Result(2,1);
	assertTrue(result==1);
}

}
