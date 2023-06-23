package collectionss;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Itera_de {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("/home/training/venkatesh/serial1.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		ArrayList a;
		a = (ArrayList) oi.readObject();
		for (Object ob : a) {
			System.out.println(ob);
		}
	}

}
