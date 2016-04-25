package lazer.datastructures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMap1 {
	public static void main(String[] args){
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(23, "Lazer");
		hmap.put(11, "Reenu");
		hmap.put(16, "Kimi");
		hmap.put(43, "Agna");
		
		Set set =hmap.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry mapentry = (Map.Entry)itr.next();
			System.out.println(mapentry.getKey()+" "+mapentry.getValue());
		}
		TreeMap<Integer, String> map = new TreeMap<Integer, String>(hmap);
		Set set2 =map.entrySet();
		Iterator itr2 = set2.iterator();
		while(itr2.hasNext()){
			Map.Entry me = (Map.Entry)itr2.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}
	}

}
