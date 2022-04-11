package com.java.testing;

import com.java.development.*;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestArithematicOperations {

	static ArithematicOperations  ao = null;
	/*
	@Before
	public void initProcess()
	{
		ao = new ArithematicOperations();
		System.out.println("Before Test Case");
	}
	
	@After
	public void endProcess()
	{
		ao = null;
		System.out.println("After Test Case ");
	}
	*/
	
	@BeforeClass
	public static void initProcess()
	{
		ao = new ArithematicOperations();
		System.out.println("Before Test Case");
	}
	
	@AfterClass
	public static void endProcess()
	{
		ao = null;
		System.out.println("After Test Case ");
	}
	@Test
	public void testAdditionForPosValues()
	{
		ArithematicOperations  ao = new ArithematicOperations();
		int expected = 10;
		int actual = ao.Addition(8, 2);
		assertEquals(expected,  actual);
	}
	
	@Test
	public void testAdditionForNegValues()
	{
		ArithematicOperations  ao = new ArithematicOperations();
		int expected = -10;
		int actual = ao.Addition(-8, -2);
		assertEquals(expected,  actual);
	}
	
	@Test
	public void testAdditionForPosAndNegValues()
	{
		ArithematicOperations  ao = new ArithematicOperations();
		int expected = 10;
		int actual = ao.Addition(12, -2);
		assertEquals(expected,  actual);
	}
}
