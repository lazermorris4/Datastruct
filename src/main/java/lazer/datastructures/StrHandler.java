package lazer.datastructures;

public class StrHandler {
	public static void main(String[] args){
		String name = "mynameislazer";
		String name2 = "MYNAMEISLAZER";
		char c = name.charAt(5);
		System.out.println(c);
		if(name.equalsIgnoreCase(name2)){
			System.out.println("Equal");
		}
		boolean a = name.startsWith("m");
		System.out.println(a);
		name.concat("Reenu");
		System.out.println(name);
	}
	
	
}
