package com.dsi.recursion.tree;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class FindPersonTest {
	
	private Person aPerson;
	private SimpleDateFormat sdf;
	
	@Before
	public void init() throws ParseException {
		
		this.aPerson = TreeWalkTestHelper.setupTree();
		sdf = new SimpleDateFormat("yyyy/mm/dd");
		
	}
	
	@Test
	public void testGetDecendent() throws ParseException {
		Assert.assertEquals(this.sdf.parse("1956/12/25"), FindPerson.findDecendent(this.aPerson, "Jim"));
		Assert.assertEquals(this.sdf.parse("2005/01/18"), FindPerson.findDecendent(this.aPerson, "Jarret"));
		Assert.assertEquals(this.sdf.parse("2014/02/01"), FindPerson.findDecendent(this.aPerson, "Julia"));
	}

	@Test
	public void testGetDecendentNotExisted() throws ParseException {
		Assert.assertEquals(null, FindPerson.findDecendent(this.aPerson, "Jonet"));

	}
	
	
}
