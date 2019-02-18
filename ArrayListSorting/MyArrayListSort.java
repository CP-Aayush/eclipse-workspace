import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Empl> list=new ArrayList<Empl>();
		list.add(new Empl("Ram",3000));
		list.add(new Empl("John",6000));
		list.add(new Empl("Chrish",2000));
		list.add(new Empl("Tom",2400));
		
		Collections.sort(list, new MySalaryComp());
		System.out.println("Sorted list entities");
		for(Empl e:list) {
			System.out.println(e.getSalary());
			
		}
		Collections.sort(list, new MyNameComp());;
		for(Empl e:list)
			System.out.println(e.name);
	}

}
class MySalaryComp implements Comparator<Empl>{
	public int compare (Empl e1,Empl e2) {
		if (e1.getSalary()>e2.getSalary()) {
			return 1;
		}else
			return -1;
	}
}
class MyNameComp implements Comparable<Empl>{
	public int compare(Empl e1,Empl e2) {
		return e1.name.compareTo(e2.name);
	}
}