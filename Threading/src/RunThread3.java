//3 classes 3 runs
public class RunThread3 {

	public static void main(String[] args) {
		
		Thread t1=new Thread4("thread1");
		Thread t2=new Thread5("thread2");
		Thread t3=new Thread6("thread3");
		
		t1.start();
		t2.start();
		t3.start();
		
		for(int i=1;i<=20;i++) {
			System.out.println(Thread.currentThread().getName());
			//System.out.println("tata");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
		System.out.println(Thread.currentThread().getName()+" dead");
	}
}

class Thread4 extends Thread{
	Thread4(String s){
		super (s);
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
			//System.out.println("chay");
		
		try {
			Thread.sleep(1000);
		}catch (Exception e) {}
	}
		System.out.println(Thread.currentThread().getName()+" dead");
	}
}
class Thread5 extends Thread{
	Thread5(String s){
		super (s);
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
			//System.out.println("chay");
		
		try {
			Thread.sleep(1000);
		}catch (Exception e) {}
	}
		System.out.println(Thread.currentThread().getName()+" dead");
	}
}
class Thread6 extends Thread{
	Thread6(String s){
		super (s);
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
			//System.out.println("chay");
		
		try {
			Thread.sleep(1000);
		}catch (Exception e) {}
	}
		System.out.println(Thread.currentThread().getName()+" dead");
	}
}