package control.threads;

public class ThreadExample2 extends Exception {
	private Thread t;
	
	public ThreadExample2() {
		this.t = new Thread(new Target());
		this.t.start();
	}
	
	public static void main(String[] args) {
		ThreadExample2 te = new ThreadExample2();
	}
}

class Target implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread is running");
	}
	
}