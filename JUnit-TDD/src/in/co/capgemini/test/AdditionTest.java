package in.co.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import in.co.capgemini.calculate.Maths;

public class AdditionTest {

	@Test
	public void testAddTwoPositives() {
		Maths math=new Maths();
		int add=math.add(2,2);
		Assert.assertEquals(4,add);
	}
	
	@Test
	public void testAddTwoNegatives() {
		Maths math=new Maths();
		int add=math.add(-2,-2);
		Assert.assertEquals(-4,add);
	}
	
	@Test
	public void testAddTwoZeros() {
		Maths math=new Maths();
		int add=math.add(0,0);
		Assert.assertEquals(0,add);
	}
	
	@Test
	public void testAddOneNegativeOneGreaterPositive() {
		Maths math=new Maths();
		int add=math.add(-2,4);
		Assert.assertEquals(2,add);
	}
	
	@Test
	public void testAddOnePositiveOneGreaterNegative() {
		Maths math=new Maths();
		int add=math.add(4,-10);
		Assert.assertEquals(-6,add);
	}
	
	@Test
	public void testAddOneZeroOneNegative() {
		Maths math=new Maths();
		int add=math.add(0,-10);
		Assert.assertEquals(-10,add);
	}
	
	@Test
	public void testAddOneZeroOnePositive() {
		Maths math=new Maths();
		int add=math.add(0,10);
		Assert.assertEquals(10,add);
	}
	

}
