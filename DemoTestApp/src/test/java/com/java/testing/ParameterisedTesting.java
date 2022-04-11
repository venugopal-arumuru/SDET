package com.java.testing;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.java.development.ArithematicOperations;

@RunWith(Parameterized.class)
public class ParameterisedTesting {

	private int fNumber = 0;
	private int sNumber = 0;	
	private int expected =0;
	private ArithematicOperations  ao = null;
	
	public ParameterisedTesting(int fNumber, int sNumber, int expected) {
		super();
		this.fNumber = fNumber;
		this.sNumber = sNumber;
		this.expected = expected;
	}
	@Parameterized.Parameters
	public static Collection getValues()
	{
		return Arrays.asList(new Object[][] {{4,5,9}, {-9,-7, -16}, {10, -9, 1}});
	}
	
	@Before
	public void initProcess()
	{
		ao = new ArithematicOperations();
	}
	
	@Test
	public void testAddition()
	{
		int exp = this.expected;
		int act = ao.Addition(this.fNumber, this.sNumber);
		assertEquals(exp, act);
	}
}
