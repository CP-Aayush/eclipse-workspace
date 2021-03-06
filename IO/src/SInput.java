import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;

public class SInput {

	public static void main(String[] args) throws IOException {

		//SequenceInputStream sin=new SequenceInputStream(new FileInputStream("chachi.txt"), new FileInputStream("chacha.txt"));
		SequenceInputStream sin=new SequenceInputStream(new MyEnum());
		
		DataInputStream din=new DataInputStream(sin);
		String s=" ";
		while(s!=null) {
			s=din.readLine();
			if(s!=null)
				System.out.println(s);
		}
		din.close();
	}

}
 class MyEnum implements Enumeration{
	InputStream in[];
	int i=-1;
	MyEnum(){
		try {
			in=new InputStream[] {new FileInputStream("chacha.txt"),new FileInputStream("chachi.txt")};
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public boolean hasMoreElements() {
		
		System.out.println("has more elements");
		if(++i<in.length)
			return true;
		else
			return false;
	}
	@Override
	public Object nextElement() {
		
		System.out.println("next element"+i);
		return in[i];
	}
}
