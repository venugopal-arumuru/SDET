package com.java.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.development.ArithematicOperations;

public class ExceptionTesting {

	@Test(expected= ArithmeticException.class)
	public void TestException()
	{
		ArithematicOperations  ao = new ArithematicOperations();
		ao.ExceptionHandle(0);
	}

}
