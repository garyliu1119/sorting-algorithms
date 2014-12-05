package com.dsi.recursion.tree;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class TreeWalkTestHelper {
	
	private Person aPerson;
	private SimpleDateFormat sdf;
	
	public void init() throws ParseException {
		this.sdf = new SimpleDateFormat("yyyy/mm/dd");
		
		Person julia = new Person("Julia", sdf.parse("2014/02/01"));
		Person joe = new Person("Joe", sdf.parse("2014/06/14"));
		Person janelle = new Person("Janelle", sdf.parse("2014/08/10"));
		Person jerome = new Person("Jerome", sdf.parse("2014/11/21"));
		
		//3rd gen
		Person julie = new Person("Julie", sdf.parse("2004/09/20"), julia);
		Person jarret = new Person("Jarret", sdf.parse("2005/01/18"), joe);
		List<Person> children = new ArrayList<Person>();
		children.add(janelle);
		children.add(jerome);
		Person jeremy = new Person("Jeremy", sdf.parse("2000/09/20"), children);
		Person janet = new Person("Janet", sdf.parse("2000/04/27"));
		
		//2nd gen
		children = new ArrayList<Person>();
		children.add(julie);
		children.add(jarret);
		Person jane = new Person("Jane", sdf.parse("1990/06/03"), children);
		
		children = new ArrayList<Person>();
		children.add(jeremy);
		children.add(janet);
		Person jack = new Person("Jack", sdf.parse("1986/02/12"), children);
		
		//1st gen
		children = new ArrayList<Person>();
		children.add(jane);
		children.add(jack);
		Person jim = new Person("Jim", sdf.parse("1956/12/25"), children);
		
		this.aPerson = jim;
		
	}
	
	public static Person setupTree () {
		TreeWalkTestHelper helper = new TreeWalkTestHelper();
		try {
			helper.init();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return helper.aPerson;
	}
}
