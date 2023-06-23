package collectionss;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al =new ArrayList();
		al.add(1);
		al.add('e');
		al.add("hello");
		al.add(1);
		al.add(2,4);
		ArrayList al1=new ArrayList();
		al1.add(1);
		//al.retainAll(al1);
		//al.removeAll(al1);
		al.addAll(al1);
 for(int i=0;i<al.size();i++)
 {
	 System.out.println(al.get(i));
	 
	}
// if(al.contains("hell"))
// {System.out.println("yes");
// 
// }else 
//	 System.out.println("no");
}

}
