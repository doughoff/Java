package control.threads;

public class CountdownThreads {
	
	public static void launchDecrementingThreadStartingAt(int i) {
//		try {
//			Thread.sleep(i%2 == 0 ? 0 : 1000);  // sleep 1 sec if i is odd
//		} catch (InterruptedException e) {}
		Thread t = new Thread(()-> {
			for (int j = i; j > 0; j-=2) {
				System.out.print(j + " ");
				Thread.yield(); // we're done here, go to next thread
//				try {
//					Thread.sleep(2000); // wait 2 seconds before printing again
//				} catch (InterruptedException e) {}  
			}
		});
		t.start();
	}
	public static void main(String[] args) {
		// start one thread from 10, decrement by 2 every 2 seconds
		launchDecrementingThreadStartingAt(10);
		// start 2nd thread from  9, decrement by 2 every 2 seconds after 1 second pause
		launchDecrementingThreadStartingAt(9);
	}


}
