package com.dsi.recursion.tree;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class FindPerson {
//	private static Queue<Person> pQueue = new LinkedList<Person>();
	
	public static Date findDecendent (Person aPerson, String name){
		return doFindDcendent(aPerson, name);
	}
	
	private static Date doFindDcendent (Person aPerson, String name) {
		if(aPerson == null) return null;
		
		if( (aPerson.getName()).equals(name)) {
			System.out.println("Find the person " + aPerson.getName());
			return aPerson.getBirthDay();
			
		} else {
			if (aPerson.getDescendents() != null) {
				for (Person child: aPerson.getDescendents()) {
					System.out.println(child.getName());
					Date date = doFindDcendent(child, name);
					if (date != null) return date;
				}
			}
		}
		return null;
	}
	
}
