import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PS1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("pss.txt");
		PrintStream ps=new PrintStream(fout);
		ps.println("Hello");
		ps.println("Hey");

	}

}
