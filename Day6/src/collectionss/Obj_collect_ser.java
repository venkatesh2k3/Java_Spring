package collectionss;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Employee implements Serializable {
	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class Obj_collect_ser {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		serialization
		FileOutputStream f = new FileOutputStream("/home/training/venkatesh/emp.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		ArrayList a = new ArrayList();
		Employee e = new Employee(1, "one");
		Employee e1 = new Employee(2, "two");
		a.add(e);
		a.add(e1);
		o.writeObject(a);
		o.close();
		f.close();

//		Deserialization
		FileInputStream fi = new FileInputStream("/home/training/venkatesh/emp.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		ArrayList a1 = (ArrayList) oi.readObject();
		for (Object ob : a1) {
			Employee em = (Employee) ob;
			System.out.println(em.id + " " + em.name);
		}

	}
}
