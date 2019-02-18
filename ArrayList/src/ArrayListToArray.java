import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("String1");
		al.add("String2");
		al.add("String3");
		al.add("String4");
		
		/*ArrayList to Array*/
		
		String array[]=new String[al.size()];
		for(int j=0;j<al.size();j++) {
			array[j]=al.get(j);
		}
		/*Displaying the array*/
		
		for(String k:array) {
			System.out.println(k);
		}
	}

}
