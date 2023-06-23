package collectionss;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Itera_se implements Serializable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream f = new FileOutputStream("/home/training/venkatesh/serial1.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		ArrayList a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add("venkatesh");
		o.writeObject(a);
		f.close();
		o.close();

	}

}
