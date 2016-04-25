package lazer.datastructures;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String reverse = "";
		char [] carray = input.toCharArray();
		for (int i = carray.length-1; i >= 0; i--) {
			reverse = reverse + carray[i];			
		}
		if(input.equalsIgnoreCase(reverse)){
			System.out.println("String is a palindrome");
		}
	}

}
