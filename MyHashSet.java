package dsa_practice;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> hs=new HashSet<String>();
		hs.add("India");
		hs.add("Hello");
		hs.add("US");
		System.out.println(hs);
		
		System.out.println(hs.remove("US"));
		hs.add("India");
		System.out.println(hs);
		hs.clear();
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		hs.add("Hi");
		hs.add("Hello");
		hs.add("namaste");
		Iterator<String> i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

}
}

	
