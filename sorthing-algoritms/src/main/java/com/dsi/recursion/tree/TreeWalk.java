package com.dsi.recursion.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeWalk {
	
	public static void walk(Person root) {
		Queue<Person> pQueue = new LinkedList<Person>();
		pQueue.add(root);
		doWalk(pQueue);
	}
	
	private static void doWalk(Queue<Person> queue) {
		if(queue.isEmpty()) return;
		Person aPerson = queue.remove();
		System.out.println(aPerson.getName());
		if(aPerson.getDescendents() != null) {
			for(Person p: aPerson.getDescendents()) {
				queue.add(p);
			}
		}
		doWalk(queue);
	}
}
