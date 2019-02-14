import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//PrintStream Example

public class Temp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("xyz.txt");
		PrintStream ps1=new PrintStream(fout);
		
		System.out.println(ps1);
		System.err.println("Hello");
	}

}
