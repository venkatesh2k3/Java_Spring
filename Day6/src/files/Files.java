package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
public class Files {

	public static void main(String[] args) throws IOException {
FileOutputStream f1 = new FileOutputStream("/home/training/venkatesh/files");
FileInputStream f = new FileInputStream("/home/training/venkatesh/files");
BufferedInputStream f2 = new BufferedInputStream(f);

String s="he is from vikas college";

byte b[]=s.getBytes();


f1.write(b);

//int i=f2.read();
//while(i!=-1)
//{
//	System.out.print((char)i);
//i=f2.read();}
//	f.close();
//	f1.close();
	}

}
