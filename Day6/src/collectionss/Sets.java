package collectionss;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		HashSet hs =new HashSet();
		LinkedHashSet lhs= new LinkedHashSet();
		TreeSet ts=new TreeSet();
		hs.add(1);
		hs.add(35);
		hs.add(-1);
		hs.add("ABE");
		hs.add("ABE");
		lhs.add(1345);
		lhs.add(0);
		lhs.add(1);
		lhs.add("AmE");
		ts.add(1);
		ts.add(0);
		ts.add(-8);
		//ts.clear();
//		System.out.println("set1 " + ts);
		//ts.retainAll(lhs);(op:1,0)
//		ts.removeAll(lhs);(op: null)
		//ts.remove(-8);(op: 0 1)
		//ts.add("ef"); (doesn't compile)
//		System.out.println("set1 "+lhs.size());
//		System.out.print("set1"+lhs);
//		System.out.println("set12"+ts);
//		System.out.println("does set1 contains set12"+ts.containsAll(lhs));
		Iterator i = ts.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
//		for(Object ob : lhs)
//		{
//			System.out.println(ob);
//		}
	}

}
