import java.io.FileInputStream;
import java.io.IOException;

//To replace or count words in a String use this class

public class MyFileReader1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fr=new FileInputStream("lalu.txt");
		byte b[]=new byte[fr.available()];
		fr.read(b);
		
		String s=new String(b);
		System.out.println(s);

	}

}
