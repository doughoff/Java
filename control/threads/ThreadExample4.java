package control.threads;

public class ThreadExample4 {
	static int countOfThreads;
	
	public static void startAThread() {
		Thread t = new Thread() {   // anonymous subclass
			@Override
			public void run() {
				System.out.printf("Thread %d is running.%n", countOfThreads++);
			}
		};
		t.start();
	}
	
	// the lambda has to obey the run() signature - no args, no return
	public static void startALambdaThread1(){
//		Thread t = new Thread( () ->  System.out.println("Lambda1 thread running.")   );
		Thread t = new Thread( () -> {
			System.out.println("Lambda1 thread running.");
			System.out.println();
			} );
		t.start();

	}
	public static void startALambdaThread2(){
//		Runnable target = () ->   System.out.println("Lambda2 thread running.");
		String threadName = "LambdaThread 2";
		Runnable target = () -> { 
			System.out.printf("%s is running but going to sleep.%n", threadName);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {		}
			System.out.printf("%s woken up.%n", threadName);
		};
		new Thread(target).start();  // no need to remember reference
		
	}
	public static void main(String[] args) {
		startAThread();
		startALambdaThread1();
		startALambdaThread2();
	}


}
