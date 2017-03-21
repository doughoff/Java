package control.threads;

public class ThreadLambda {
	static void process() {
		System.out.println("Thread " + Thread.currentThread().getName() 
				+ " printing...");
	}

	public static void main(String[] args) {
		new Thread(new Runnable() {   // anonymous class
			@Override
			public void run() {
				process();
			}
		});

		// new Thread(lambda run function)
		// Arrays.sort(array, lambda compare function)
		Runnable r = () -> process();
		Thread t1 = new Thread(() -> process());
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
		new Thread(r).start();
	}
}
