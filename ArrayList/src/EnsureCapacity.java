import java.util.Vector;

public class EnsureCapacity {

	public static void main(String[] args) {
		
		//ArrayList with capacity 4
		//ArrayList<String> al=new ArrayList<String>(4);
		Vector<String> al=new Vector<String>(4);
		System.out.println(al.capacity());
		//adding 4 elements
		
		al.add("Hi");
		al.add("Hello");
		al.add("Bye");
		al.add("Gm");
		
		//Increase capacity to 76
		al.ensureCapacity(76);
		System.out.println(al.capacity());
		System.out.println(al);
		al.add("GE");
		al.add("GE");
		al.add("GE");
		
		for(String temp:al)
			System.out.println(temp);
	}

}
