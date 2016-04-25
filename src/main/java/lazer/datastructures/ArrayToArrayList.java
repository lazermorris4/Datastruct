package lazer.datastructures;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
	public static void main(String[] args){
	String[] names ={"Lazer", "Reenu", "Agna"};
	ArrayList<String> arlist = new ArrayList<String>(Arrays.asList(names));
	for(String names1: arlist){
		System.out.println(names1);
	}
	}
}
