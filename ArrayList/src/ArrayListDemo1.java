import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		int x[]= {1,-1,2,-2,3,-3,4,-4};
		for(int i=0;i<x.length;i++)
			al.add(x[i]);
		System.out.println(al);
		Iterator<Integer> i=al.iterator();
		while (i.hasNext()) {
			//Integer z=(Integer) i.next();
			Integer z=i.next();
			if(z.intValue()<0)
				i.remove();
		}
		System.out.println(al);
	}

}
