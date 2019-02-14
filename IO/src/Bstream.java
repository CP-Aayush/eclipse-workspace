import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Bstream {

	public static void main(String[] args) {
		String srcFile="lalu.txt";
		try {
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcFile));
			//Read one byte at a time & display it
			byte byteData;
			while((byteData=(byte)bis.read())!=-1) {
				System.out.println((char)byteData);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
