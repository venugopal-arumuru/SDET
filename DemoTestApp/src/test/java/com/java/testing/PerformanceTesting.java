package com.java.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.development.ArithematicOperations;

public class PerformanceTesting {

	@Test(timeout=1000)  // 1000 milli seconds = 1 sec
	public void testPerformance()
	{
		ArithematicOperations  ao = new ArithematicOperations();
		ao.Performance();
	}
}
