import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListShuffle {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();
		al.add("Java");
		al.add("cric");
		al.add("Play");
		
		System.out.println("Result before shuffle operation");
		for(String str:al)
			System.out.println(str);
		Collections.shuffle(al);
		for(String str:al)
			System.out.println(str);
		Collections.shuffle(al);
		for(String str:al)
			System.out.println(str);
	}

}
