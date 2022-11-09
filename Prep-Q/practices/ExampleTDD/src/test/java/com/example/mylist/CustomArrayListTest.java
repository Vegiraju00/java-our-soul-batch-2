package com.example.mylist;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomArrayListTest {
	CustomArrayList cust=null;
	@Before
	public void setUp() throws Exception {
		cust=new CustomArrayList();
	}

	@After
	public void tearDown() throws Exception {
		CustomArrayList cust=null;
	}

	@Test
	public void testAdd() {
		cust.add(10);
		cust.add(11);
		assertEquals(2,cust.size());
		
	}
	@Test
	public void testToString() {
		cust.add(10);
		cust.add(11);
		String s="[10,11]";
		assertEquals(s,cust.toString());
	}
	
	@Test
	public void testToString1() {
		cust.add(10);
		cust.add(11);
		cust.add(10);
		cust.add(11);
		String s="[10,11,10,11]";
		assertEquals(s,cust.toString());
	}
	
	@Test
	public void testRemove() {
		cust.add(10);
		cust.add(11);
		cust.add(12);
		cust.add(13);
		cust.remove(2);
		assertEquals(3,cust.size());
		String s="[10,11,13]";
		assertEquals(s,cust.toString());
		
	}
	
}
