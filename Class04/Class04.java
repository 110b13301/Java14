import java.io.*;
public class Class04 {
	public static void main(String args[]) throws IOException {
		FileReader fr= new FileReader("c:\\Class04\\donkey.txt");
		char data[]=new char[128];
		int n =fr.read(data);
		String str=new String(data,0,n);
		System.out.println(str);
		System.out.print(n+"words");
		fr.close();
	}
}