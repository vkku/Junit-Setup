package com.shobhit.iitbbsr.assignment;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SetTest {

	Set set = new Set();

	@Test
	public void testContainsArithTriple() {
		set.insert(-5);
		set.insert(3);
		set.insert(0);
		set.insert(4);
		set.insert(8);
		assertEquals(true, set.containsArithTriple());
	}
	
	@Test
	public void testMember()
	{
		set.insert(1);
		set.insert(3);
		set.insert(2);
		set.insert(4);
		assertEquals(false, set.member(-1));
	}
	
	@Test
	public void testToArray()
	{
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		set.insert(1);
		set.insert(2);
		set.insert(3);
		set.insert(4);
		set.insert(5);
		set.insert(6);
		set.insert(7);
		assertArrayEquals(a, set.toArray());
	}
}
