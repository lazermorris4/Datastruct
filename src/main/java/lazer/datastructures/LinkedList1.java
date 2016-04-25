package lazer.datastructures;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args){
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.addFirst("Lazer");
		linkedlist.addLast("Agna");
		linkedlist.pollLast();
		linkedlist.add("Reenu");
		Iterator itr = linkedlist.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		for(String names:linkedlist){
			System.out.println(names);
		}
		
	}
	

}
