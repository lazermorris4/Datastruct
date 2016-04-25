package lazer.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrList {
public static void main(String[] args){
	ArrayList<String> arrlist = new ArrayList<String>();
	ArrayList<String> arrlist2 = new ArrayList<String>();
	arrlist.add("Lazer");
	arrlist.add("Reenu");
	arrlist.add("Agna");
	Iterator<String> itr = arrlist.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
	Collections.sort(arrlist);
	for(String name: arrlist){
		System.out.println(name);
	}
	Collections.sort(arrlist,Collections.reverseOrder());
	for(String name: arrlist){
		System.out.println(name);
	}
	arrlist2.add("Manu");
	arrlist2.addAll(arrlist);
	Collections.sort(arrlist2, Collections.reverseOrder());
	for(String name: arrlist2){
		System.out.println(name);
	}
}
}
