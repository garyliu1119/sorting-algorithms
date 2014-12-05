package com.dsi.recursion.tree;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person {
	
	private String name;
	public Date birthDay;
	public List<Person> descendents;

	public Person()
	{
		this.descendents = new ArrayList<Person>();
	}

	public Person(String name, Date bday)
	{
		this.name = name;
		this.birthDay = bday;
	}

	public Person(String name, Date bDay, Person child)
	{
		this(name, bDay);
		this.descendents = new ArrayList<Person>();
		this.descendents.add(child);
	}
	
	public Person(String name, Date bDay, List<Person> descendents)
	{
		this(name, bDay);
		this.descendents = descendents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public List<Person> getDescendents() {
		return descendents;
	}

	public void setDescendents(List<Person> descendents) {
		this.descendents = descendents;
	}
}
