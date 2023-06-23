package collectionss;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Coll_de {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArrayList a1 = null;
		FileInputStream fi = new FileInputStream("/home/training/venkatesh/serial1.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		a1=(ArrayList)oi.readObject();
		for(Object ob: a1)
		{
			System.out.println(ob);
		}
	}

}
