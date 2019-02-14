
public class RunThreadByAssociation {

	public static void main(String[] args) {
		Thread11 t1=new Thread11();
		//Thread12 t2=new Thread12();
	
	}

}
class Thread11 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}
	
}