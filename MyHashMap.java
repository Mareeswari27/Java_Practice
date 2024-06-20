package dsa_practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap<Integer, String> hm=new HashMap<>();
			hm.put(1, "Hi");
			hm.put(2, "Hello");
			System.out.println(hm);
			System.out.println(hm.get(2));
			//hm.remove(1);
			
			Set sn=hm.entrySet();
			Iterator it=sn.iterator();
			while(it.hasNext()) {
				Map.Entry mp=(Map.Entry)it.next();
				System.out.println(mp.getKey());
				System.out.println(mp.getValue());
				
			}
		
		

	}

}
