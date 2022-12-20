import java.io.*;
public class Class07 {
	public static void main(String args[]) throws IOException {
		FileReader fr= new FileReader("E:\\作業\\14\\Class07\\donkey.txt");
		char data[]=new char[128];
		int n =fr.read(data, 0, 15);
		String str=new String(data,0,n);
		System.out.println(str);
		System.out.println(n+"words");
		fr.close();
	}
}