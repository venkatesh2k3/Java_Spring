package collectionss;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable {
	int id;
	String name;

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream f = new FileOutputStream("/home/training/venkatesh/serial2.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		Emp e = new Emp(1, "one");
		Emp e1 = new Emp(2, "two");
//		ArrayList a = new ArrayList();
//		a.add(e);
//		a.add(e1);

		o.writeObject(e);
		o.writeObject(e1);
		o.close();
		f.close();

	}

}
