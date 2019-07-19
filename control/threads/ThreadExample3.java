package control.threads;

public class ThreadExample3 extends Exception implements Runnable {
	private Thread t;
	public static int countOfThreads;
	
	@Override
	public void run() {
		System.out.printf("%s started.%n", this.t.getName());
		System.out.printf("%s died.%n", this.t.getName());
		
	}
	public ThreadExample3() {
		this.t = new Thread(this);
		countOfThreads++;
//		this.t.setName("Thread #" + countOfThreads);
		this.t.start();
	}
	
	public static void main(String[] args) {
		System.out.printf("%s started.%n", Thread.currentThread().getName());
		ThreadExample3 te1 = new ThreadExample3();
		ThreadExample3 te2 = new ThreadExample3();
		ThreadExample3 te3 = new ThreadExample3();
		ThreadExample3 te4 = new ThreadExample3();
		System.out.printf("%s ended.%n", Thread.currentThread().getName());
	}
}
