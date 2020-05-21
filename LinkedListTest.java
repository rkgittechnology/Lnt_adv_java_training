package com.rk.collection;

import java.util.LinkedList;

class Test{
	public static void m1() {
		LinkedList ll=new LinkedList();
		ll.add(5);
		ll.add(65);
		ll.add(33);
		ll.add(12);
		ll.add(123);
		System.out.println(ll);
		System.out.println("the third index value is:"+ll.get(3));
		if(ll.get(4).equals(123)) {
			System.out.println(ll.set(4,10));
		}
		System.out.println("values after modification:"+ll);
		System.out.println("the size of ::"+ll.size());
		System.out.println("removing the value from the given index::"+ll.remove(4));
		System.out.println("final value of linked list:"+ll);
		
	}
}
public class LinkedListTest {

	public static void main(String[] args) {
		Test.m1();
	}

}
