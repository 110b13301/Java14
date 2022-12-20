import java.io.*;
public class Java10 {
	public static void main(String args[]) throws IOException {
		FileWriter fw1= new FileWriter("E:\\作業\\14\\Java10\\rand.txt");
		FileWriter fw2= new FileWriter("E:\\作業\\14\\Java10\\rand2.txt");
		BufferedWriter bfw1= new BufferedWriter(fw1);
		BufferedWriter bfw2= new BufferedWriter(fw2);
		for(int i=1; i<=1000;i++) { //(a)do 1000 times
			bfw1.write(Integer.toString((int)(Math.random()*100000)+1)); //(a)spawn 1~99999 and write it to rand.txt 
			bfw1.newLine();
		}
		bfw1.flush();
		System.out.println("rand.txt done");
		
		FileReader fr1= new FileReader("E:\\作業\\14\\Java10\\rand.txt");
		BufferedReader bfr1= new BufferedReader(fr1);

		String str;
		int max=0, min=99999, total=0;
		while((str=bfr1.readLine())!=null) {
			if(max<Integer.parseInt(str)) { //(b)find max
				max=Integer.parseInt(str);
			}
			if(min>Integer.parseInt(str)) { //(b)find min
				min=Integer.parseInt(str);
			}
			total+=Integer.parseInt(str);
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
		System.out.println("avg="+total/1000);
		fr1.close();

		FileReader fr2=new FileReader("E:\\作業\\14\\Java10\\rand.txt"); //(c)renew FileReader to readLine again
		BufferedReader bfr2=new BufferedReader(fr2);
		int[] li=new int[1000];
		int count=0;
		while((str=bfr2.readLine())!=null) { //(c)readLine again
			li[count]=Integer.parseInt(str); //(c)add data to list
			count++;
		}
		for(int i=0; i<1000;i++) { //(c)arranging numbers
			for (int j=0; j<1000; j++) {
				if (li[i] < li[j]) {
					int temp = li[i];
					li[i] = li[j];
					li[j] = temp;
				}
			}
		}
		for(int i=0; i<1000;i++) {
			bfw2.write(Integer.toString(li[i])); //(c)write arranged numbers to rand2.txt
			bfw2.newLine();
		}
		bfw2.flush();
		System.out.println("rand2.txt done");
		
		fr2.close();
		fw2.close();
		fw1.close();
	}
}