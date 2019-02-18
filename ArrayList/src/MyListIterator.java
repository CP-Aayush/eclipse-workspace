import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MyListIterator {

	public static void main(String[] args) {

		List<Integer> li=new ArrayList<Integer>();
		ListIterator<Integer> litr=null;
		
		li.add(23);
		li.add(98);
		li.add(29);
		li.add(71);
		li.add(5);
		
		litr=li.listIterator();
		System.out.println("Element in forward direction");
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("Element in backward dir");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}

}
