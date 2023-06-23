package collectionss;

import java.security.KeyStore.Entry;
import java.util.*;

public class Map_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		For HashMap
		 
		HashMap hm = new HashMap();
		hm.put(523,"one");
		hm.put(25678,"one");
		hm.put(3,"two");
		hm.put(92,"two");
		hm.put(null,"two");
		//hm.put(null,"one"); (op: only one null key accepts)
//		For LinkedHashMap
		
		LinkedHashMap <Integer,String> lhm = new LinkedHashMap <Integer,String>();
		lhm.put(234,"hello");
		lhm.put(2345,"hello");
		lhm.put(654, "abc");
//		For TreeMap
		TreeMap<Integer, String> tm =new TreeMap();
		tm.put(656,"a");
		tm.put(65,"b");
//		tm.put(null,"e");(op: java.lang.NullPointerException)
		tm.put(5963,"c");
//		For HashTable
		Hashtable <Integer,String> ht =new Hashtable <Integer,String>();
		ht.put(2,"hi");
		//ht.put(null, null);
		//ht.put(null, "hello hi");
		//ht.put(1, null);
		ht.put(34,"hey");
		ht.put(4, "wow");
		Set s = hm.entrySet();
		Iterator i = s.iterator();
		System.out.println("HashMap");
		while(i.hasNext())
		{
			Map.Entry me = (Map.Entry) i.next();
			
			System.out.println(me.getKey()+"	"+me.getValue());
		}
		System.out.println("HashMap");
		for (Map.Entry m : lhm.entrySet())
		{
			System.out.println(m.getKey()+"		"+m.getValue());
		}
		System.out.println("TreeMap");
		for(Map.Entry m1 : tm.entrySet()) 
		{
			System.out.println(m1.getKey()+"	"+m1.getValue());
		}
		System.out.println("HashTable");
		for(Map.Entry m2 : ht.entrySet())
		{
			System.out.println(m2.getKey()+"	"+m2.getValue());
		}
				
	}

}
