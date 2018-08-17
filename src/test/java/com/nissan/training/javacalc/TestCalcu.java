package com.nissan.training.javacalc;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalcu {

	@Test
	public void testAdd() {
		Calcu c1 = new Calcu();
		assertEquals(10,c1.add(5, 5));
	}
	
	@Test
	public void testSub() {
		Calcu c1 = new Calcu();
		assertEquals(10,c1.sub(20, 10));
	}

}
