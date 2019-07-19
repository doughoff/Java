package control.threads;

import java.io.IOException;

public class JoinTest {

	public static void main(String[] args) {
		System.out.println("Main thread forking");
		
		Runnable target = () -> { 
			System.out.println("Reading from console... ");
			try {
				System.in.read();
			} catch (IOException e) {}
			System.out.println("Join test thread complete.");
		};
		String name = "Join test thread";
		Thread t = new Thread(target, name);
		t.start();

		System.out.println("Main thread joining (waiting on thread to complete)");
		try {
			t.join(); 		// main waits for t to complete
		} catch (InterruptedException e) { }  
		
		System.out.println("Main thread complete.");
	}
}
