package demo01.linkedlist;

import in.conceptarchitect.collections.LinkedList;
import in.conceptarchitect.collections.Node;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n=new Node();
		n.value=100;
		LinkedList list=new LinkedList();
	    list.add(100);
	    list.add(200);
	    list.add(300);
	    list.add(400);	
	    System.out.println(list);    
	}

}
