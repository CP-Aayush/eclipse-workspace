import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Serializer1 {

	public static void main(String[] args) {
		
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(new Emp(10));
		al.add(new Emp(20));
		al.add(new Emp(30));
		
		try {
			FileOutputStream fos=new FileOutputStream("myfile");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(al);
			oos.close();
			fos.close();
			System.out.println("after deserialization");
			FileInputStream fin=new FileInputStream("myfile");
			ObjectInputStream oin=new ObjectInputStream(fin);
			
			ArrayList<?> al1=(ArrayList<?>) oin.readObject();
			Iterator<Emp> i=(Iterator<Emp>) al1.iterator();
			while(i.hasNext()) {
				Emp e=i.next();
				System.out.println(e.x);
				
			}
		}catch(Exception ioe) {
			ioe.printStackTrace();
		}
	}

}
class Emp implements Serializable{
	int x;
	Emp(int x){
		this.x=x;
	}
}