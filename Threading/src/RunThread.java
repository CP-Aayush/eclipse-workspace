
public class RunThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1=new Thread1("Thread1");
		Thread2 t2=new Thread2("Thread2");
		Thread3 t3=new Thread3("Thread3");
		
		t1.start();
		t2.start();
		t3.start();
		
		for(int i=1;i<=20;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}

class Thread1 extends Thread{
	Thread1(String s){
		super (s);
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(getName());
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}

class Thread2 extends Thread{
	Thread2(String s){
		super (s);
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(getName());
			try {Thread.sleep(500);}catch(Exception e) {}

		}
	}
}
class Thread3 extends Thread{
	Thread3(String s){
		super (s);
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(getName());
			try {Thread.sleep(500);}catch(Exception e) {}

		}
	}
}