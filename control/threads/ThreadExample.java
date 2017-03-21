package control.threads;

public class ThreadExample extends Thread {
	String whatToPrint;

	public ThreadExample(String _whatToPrint) {
		this.whatToPrint = _whatToPrint;
	}
	
	@Override
	public void run() {
		for (int j = 0; j < 100; j++) { // how many to print
			for (long i = 0; i < 500000000; i++) { // 500,000,000
			} // waste time to slow down
			System.out.print(this.whatToPrint);
		}
	}

	public static void main(String[] args) {
		ThreadExample a = new ThreadExample("*** ");
		ThreadExample b = new ThreadExample("111 ");
		ThreadExample c = new ThreadExample("--- ");

		a.start();
		b.start();
		c.start();
		System.out.println("\nMain thread completed.");
	}
}
