import java.io.FileInputStream;
import java.io.IOException;

public class MyFileReader {

	public static void main(String[] args) throws IOException {
		FileInputStream fr=new FileInputStream("lalu.txt");
		//FileInputStream fr= new FileInputStream("E:\\f2\\lalu2.txt");\
		
		int i=0;
		while((i=fr.read())!= -1)
			System.out.println((char)i);
		fr.close();
	}

}
