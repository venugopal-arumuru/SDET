package com.java.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.development.ArithematicOperations;

public class TestArrayOperations {

	@Test
	public void testFindBigArrayPosValues()
	{
		ArithematicOperations  ao = new ArithematicOperations();
		int expected = 12;
		int actual = ao.findMax(new int[] {10,4,3,12,9});
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFindBigArrayNegValues()
	{
		ArithematicOperations  ao = new ArithematicOperations();
		int expected = -3;
		int actual = ao.findMax(new int[] {-10,-4,-3,-12,-9});
		
		assertEquals(expected, actual);
	}
}
