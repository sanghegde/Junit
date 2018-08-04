////Junit test case for Multiplication in calculator
package in.co.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import in.co.capgemini.calculate.Maths;

public class MultiplicationTest {

		@Test
		public void testMultiplyTwoPositives() {
			Maths math=new Maths();
			int mul=math.multiply(2,2);
			Assert.assertEquals(4,mul);
		}
		
		@Test
		public void testMultiplyTwoNegatives() {
			Maths math=new Maths();
			int mul=math.multiply(-2,-2);
			Assert.assertEquals(4,mul);
		}
		
		@Test
		public void testMultiplyOnePositiveOneNegative() {
			Maths math=new Maths();
			int mul=math.multiply(2,-2);
			Assert.assertEquals(-4,mul);
		}
		
		@Test
		public void testMultiplyTwoZeros() {
			Maths math=new Maths();
			int mul=math.multiply(0,0);
			Assert.assertEquals(0,mul);
		}
		
		@Test
		public void testMultiplyOneZeroOneNonZero() {
			Maths math=new Maths();
			int mul=math.multiply(0,2);
			Assert.assertEquals(0,mul);
		}
	}
