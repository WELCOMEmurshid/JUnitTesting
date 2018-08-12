package agileUniteTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		assertEquals("error in addMethod()", 4, Calulator.addMethod(2, 2));
		assertEquals("error in addMethod()", 5, Calulator.addMethod(3, 2));
		assertEquals("error in addMethod()", 9, Calulator.addMethod(4, 5));
		assertEquals("error in addMethod()", 0, Calulator.addMethod(0, -0));
		
		assertEquals("error in subMethod()", 0, Calulator.subMethod(2, 2));
		assertEquals("error in subMethod()", 1, Calulator.subMethod(3, 2));
		assertEquals("error in subMethod()", -1,Calulator.subMethod(4, 5));
		assertEquals("error in subMethod()", 0,Calulator.subMethod(0, -0));
		
		assertEquals("error in multMethod()", 25, Calulator.multMethod(5, 5));
		assertEquals("error in multMethod()", 9, Calulator.multMethod(3, 3));
		assertEquals("error in multMethod()", 4, Calulator.multMethod(2, 2));
		assertEquals("error in multMethod()", 100, Calulator.multMethod(20, 5));
		
		//double n1 = 5.0;
		//double n2 = 5.1;
		
		//assertEquals("error divMethod()", 1.0, Calulator.divMethod(n1, n2);
		
	}

}
