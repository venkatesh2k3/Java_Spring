package collectionss;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException, EOFException {
		FileInputStream fi = new FileInputStream("/home/training/venkatesh/serial2.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Emp e;
		try {
			while ((e = (Emp) oi.readObject()) != null) {

				System.out.println(e.id + " " + e.name);
			}
		} catch (Exception e1) {
			System.out.println("file ended");
		}
		oi.close();
		fi.close();
	}

}
