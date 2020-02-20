package Simp_Comp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

//import Simple_Compound.SimpAndComp;

public class SimpTest {
	Simp_Comp s;
	@Before
	public void init()
	{
		s=new Simp_Comp();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(20,s.interest(6000,1,2),0);
		assertEquals(35,s.compound(6000,20,1),0);
	}

}
