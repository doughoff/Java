package control.threads;

public class TestProcessorThreading implements Runnable {

	private int numberOfThreads;
	private long totalIterations;
	private Thread[] threads;

	public static void main(String[] args) {
		TestProcessorThreading test = new TestProcessorThreading();
		test.numberOfThreads = 3;
		test.totalIterations = 2000000000L;

		test.threads = new Thread[test.numberOfThreads];
		long start = System.currentTimeMillis();
		test.createAndRunThreads();
		long stop = System.currentTimeMillis();
		System.out.println("Total time was " + (stop - start) + " ms.");
	}

	private void createAndRunThreads() {
		for (int i = 0; i < this.numberOfThreads; i++) {
			Thread t = new Thread(this);
			t.setName("t" + i);
			t.start();
			this.threads[i] = t;
		}
		for (int i = 0; i < this.numberOfThreads; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		this.goIterate();
	}

	private void goIterate() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < this.totalIterations / this.numberOfThreads; i++) {
			// do nothing
		}
		long stop = System.currentTimeMillis();
		System.out.println(Thread.currentThread().getName() + " ran " + (stop - start) + " ms.");
	}
}
