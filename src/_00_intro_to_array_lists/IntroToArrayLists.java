package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList <String> cities= new ArrayList <String>();
		//2. Add five Strings to your list
		cities.add("San Diego");
		cities.add("New York");
		cities.add("Washington DC");
		cities.add("Houston");
		cities.add("Las Vegas");
		//3. Print all the Strings using a standard for-loop
		for(int i=0; i<cities.size(); i++) {
			String s= cities.get(i);
			System.out.println(s);
		}
		//4. Print all the Strings using a for-each loop
		for(String s: cities) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for(int i=0; i<cities.size(); i++) {
			String s= cities.get(i);
			if(i % 2 == 0) {
				System.out.println(s);
			}
		}
		//6. Print all the Strings in reverse order.
		for(int i= 4; i>=0; i--) {
			String s= cities.get(i);
			System.out.println(s);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i=0; i<cities.size(); i++) {
			String s = cities.get(i);
			if(s.contains("e")) {
				System.out.println(s);
			}
		}
	}
}
