package in.co.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import in.co.capgemini.calculate.Maths;

public class SubtractionTest {

		@Test
		public void testSubtractOnePositiveOneGreaterPositive() {
			Maths math=new Maths();
			int sub=math.sub(2,4);
			Assert.assertEquals(-2,sub);
		}
		
		@Test
		public void testSubtractOneGreaterPositiveOnePositive() {
			Maths math=new Maths();
			int sub=math.sub(4,2);
			Assert.assertEquals(2,sub);
		}
		
		@Test
		public void testSubtractOneGreaterNegativeOneNegative() {
			Maths math=new Maths();
			int sub=math.sub(-4,-2);
			Assert.assertEquals(-2,sub);
		}
		
		@Test
		public void testSubtractOneNegativeOneGreaterNegative() {
			Maths math=new Maths();
			int sub=math.sub(-2,-4);
			Assert.assertEquals(2,sub);
		}
		
		@Test
		public void testSubtractOneZeroOneNegative() {
			Maths math=new Maths();
			int sub=math.sub(0,-4);
			Assert.assertEquals(4,sub);
		}
		
		@Test
		public void testSubtractOneZeroOnePositive() {
			Maths math=new Maths();
			int sub=math.sub(0,4);
			Assert.assertEquals(-4,sub);
		}
		
		@Test
		public void testSubtractTwoZeros() {
			Maths math=new Maths();
			int sub=math.sub(0,0);
			Assert.assertEquals(0,sub);
		}
		
		@Test
		public void testSubtractOneGreaterNegativeOnePositive() {
			Maths math=new Maths();
			int sub=math.sub(-4,1);
			Assert.assertEquals(-5,sub);
		}
		
		@Test
		public void testSubtractOnePositiveOneGreaterNegative() {
			Maths math=new Maths();
			int sub=math.sub(1,-4);
			Assert.assertEquals(5,sub);
		}
		
		@Test
		public void testSubtractOneGreaterPositiveOneNegative() {
			Maths math=new Maths();
			int sub=math.sub(4,-1);
			Assert.assertEquals(5,sub);
		}
		
		@Test
		public void testSubtractOneNegativeOneGreaterPositive() {
			Maths math=new Maths();
			int sub=math.sub(-1,4);
			Assert.assertEquals(-5,sub);
		}
		
		@Test
		public void testSubtractEquals() {
			Maths math=new Maths();
			int sub=math.sub(4,4);
			Assert.assertEquals(0,sub);
		}
		
		@Test
		public void testSubtractOneNegativeOneZero() {
			Maths math=new Maths();
			int sub=math.sub(-4,0);
			Assert.assertEquals(-4,sub);
		}
		
		@Test
		public void testSubtractOnePositiveOneZero() {
			Maths math=new Maths();
			int sub=math.sub(4,0);
			Assert.assertEquals(4,sub);
		}
		
			
	}


