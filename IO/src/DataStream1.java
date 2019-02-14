import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fout=new FileOutputStream("ducat4.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		
		dout.writeInt(10);
		dout.writeLong(10l);
		dout.writeBoolean(true);
		dout.writeDouble(10.9);
		dout.close();
		
		FileInputStream fin=new FileInputStream("ducat4.txt");
		DataInputStream din=new DataInputStream(fin);
		
		int i=din.readInt();
		long l=din.readLong();
		boolean b=din.readBoolean();
		double d=din.readDouble();
		din.close();
		
		System.out.println(i);
		System.out.println(l);
		System.out.println(b);
		System.out.println(d);

	}

}
