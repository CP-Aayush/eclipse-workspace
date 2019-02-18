import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		/*Array Declaration & Initialization*/
		
		String citynames[]= {"Agra","Mysore","Chandigarh","Bhopal"};
		
		List<String> l=Arrays.asList(citynames);
		
		ArrayList<String> cityList=new ArrayList<String>(l);
		cityList.add("New Delhi");
		cityList.add("New City");
		
		for(String str:cityList) {
			System.out.println(str);
		}
	}

}
