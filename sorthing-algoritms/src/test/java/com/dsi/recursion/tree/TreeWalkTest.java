package com.dsi.recursion.tree;

import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;

public class TreeWalkTest {
	
	private Person aPerson;
	
	@Before
	public void init() throws ParseException {
		
		this.aPerson = TreeWalkTestHelper.setupTree();
		
	}
	
	@Test
	public void testWalk() throws ParseException {
		TreeWalk.walk(this.aPerson);
	}
}
