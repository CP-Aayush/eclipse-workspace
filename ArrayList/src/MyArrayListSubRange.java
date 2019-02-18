import java.util.ArrayList;
import java.util.List;

public class MyArrayListSubRange {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Ramdom");
		al.add("Click");
		System.out.println("Actual ArrayList :"+al);
		
		List<String> list = al.subList(2, 4);
		System.out.println("Sub Limit"+list);
	}

}
