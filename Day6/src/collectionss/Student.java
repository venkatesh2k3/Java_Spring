package collectionss;

import java.util.ArrayList;
import java.util.Iterator;

class Demo1
{int id;
String s;
Demo1(int id,String s)
{
	this.id=id;
	this.s=s;
}
	
}

public class Student {

	public static void main(String[] args) {
		Demo1 d1= new Demo1 (1,"Arjun");
		Demo1 d2= new Demo1(2,"krishna");
		ArrayList a= new ArrayList();
		a.add(d1);
		a.add(d2);
		Iterator it= a.iterator();
		while(it.hasNext())
		{
			Demo1 d3=(Demo1)it.next();
			System.out.println(d3.id+" "+d3.s);
		}
	}

}
