package collectionss;

import java.util.*;
import java.util.ListIterator;
class Name {
	int id;
	String s;
	Name(int id, String s)
	{ this.id=id;
	this .s=s;
	
	}
	
}

public class Fake {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		Name c= new Name(501,"venkatesh");
		Name b= new Name(520,"aditya");
		ArrayList a= new ArrayList();
		a.add(c);
		a.add(b);

		ListIterator i = a.listIterator();
		while(i.hasNext())
		{
			Name s3 =(Name)i.next();
			System.out.println(s3.id+" "+s3.s);
		}
		
	}}
		