package control.threads;

public class SimpleFork implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Thread(new SimpleFork()).start();
		new Thread(new SimpleFork()).start();
		new Thread(new WorkFlow("my first task list.")).start();
		new Thread(new WorkFlow("my second task list.")).start();
	}

}

class WorkFlow implements Runnable {
	String option1;

	public WorkFlow(String option1) {
		this.option1 = option1;
	}

	@Override
	public void run() {
		System.out.println("Working with " + this.option1);
	}
}
