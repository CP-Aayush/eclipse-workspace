import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileWriter {

	public static void main(String[] args)throws IOException {
		//FileOutputStream fw=new FileOutputStream("lalu.txt");				//Write Mode
		//FileOutputStream fw=new FileOutputStream("lalu.txt",true);		//Append Mode
		
		FileOutputStream fw=new FileOutputStream(new File("E:\\f2\\lalu2.txt"));
		//FileOutputStream fw=new FileOutputStream(new File("E:\\f2\\lalu2.txt"),true);
		
		String s ="India is a good country";
		
		byte ch[]=s.getBytes();
		//fw.write()ch;
		
		for(int i=0;i<ch.length;i++)
			fw.write(ch[i]);
		
		fw.close();
		System.out.println("file created successfuly");
	}

}
