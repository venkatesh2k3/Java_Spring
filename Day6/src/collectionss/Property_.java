package collectionss;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_ {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream("/home/training/venkatesh/pro.properties");
		Properties p = new Properties();
		p.setProperty("name", "venkatesh");
		p.setProperty("age", "20");
		p.store(fo, "venkatesh is a intern");
		FileInputStream fi =new FileInputStream("/home/training/venkatesh/pro.properties");
		Properties p1= new Properties();
		p1.load(fi);
		String n = p1.getProperty("name");
		String n1 = p1.getProperty("age");
		System.out.println(n+" "+n1);
	}

}
