import java.util.ArrayList;

public class MyArrayListArray {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Ramdom");
		
		System.out.println("Actual ArrayList ="+al);
		String[] strArr=new String[al.size()];
		al.toArray(strArr);
		System.out.println("Created Array content");
		for(String str:strArr) {
			System.out.println(str);
		}
	}

}
