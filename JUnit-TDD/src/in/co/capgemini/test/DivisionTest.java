package in.co.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import in.co.capgemini.calculate.Maths;

public class DivisionTest {

		@Test
		public void testDivideTwoPositives() {
			Maths math=new Maths();
			float div=math.divide(2,2);
			Assert.assertEquals(1,div,0);
		}
		
		@Test
		public void testDivideTwoNegatives() {
			Maths math=new Maths();
			float div=math.divide(-2,-2);
			Assert.assertEquals(1,div,0);
		}
		
		@Test
		public void testDivideOnePositiveOneNegative() {
			Maths math=new Maths();
			float div=math.divide(2,-2);
			Assert.assertEquals(-1,div,0);
		}
		
		@Test
		public void testDivideOneZero() {
			Maths math=new Maths();
			float div=math.divide(0,2);
			Assert.assertEquals(0,div,0);
		}
		
		@Test(expected=ArithmeticException.class)
		public void testDivideByZero() {
			Maths math=new Maths();
			float div=math.divide(2,0);
			Assert.assertEquals(0,div,0);
		}
		
	}
