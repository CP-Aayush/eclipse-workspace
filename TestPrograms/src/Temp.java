
public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		notmain();

	}
	public static void notmain() {
		Thread t1=Thread.currentThread();
		System.out.println(t1.getName());
	}

}
