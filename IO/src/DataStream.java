import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Take input from the user

public class DataStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		DataInputStream din=new DataInputStream(System.in);
		
		FileOutputStream fout=new FileOutputStream("ducat4.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		String s="";
		while(!s.equalsIgnoreCase("stop")) {
			s=din.readLine();
			System.out.println(s);
			
			dout.writeBytes(s);
			dout.writeUTF(s);
			dout.writeChars(s);
			
			dout.flush();
		}
		din.close();
		dout.close();
		

	}

}
