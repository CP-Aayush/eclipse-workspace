
public class OneClassMObject {

	public static void main(String[] args) {
		Thread t1=new Thread1("thread1");
		Thread t2=new Thread1("thread2");
		Thread t3=new Thread1("thread3");
		
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

/* class Thread1 extends Thread{
	Thread1(String s){
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
*/