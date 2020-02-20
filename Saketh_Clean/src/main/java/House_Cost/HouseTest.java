package House_Cost;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

//import cleancode.House;

public class HouseTest {

	House h;
	@Before
	public void initialize()
	{
		h=new House();
	} 
	//@SuppressWarnings("deprecation")
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(4500000,h.FullyHomeCost("HighStandardMaterials",2500),0);
	}
}
