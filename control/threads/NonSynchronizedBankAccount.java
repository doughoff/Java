package control.threads;

public class NonSynchronizedBankAccount implements Runnable {
	private String name;
	private int balance = 50;
	static int lineCount = 1;

	public int getBalance() {
		return this.balance;
	}

	public void setName(String _name) {
		this.name = _name;
	}

	private void withdraw(int withdrawalAmount) {
		this.balance = this.balance - withdrawalAmount;
	}

	private void printMessage(String message) {
		System.out.println(lineCount++ + ": " + Thread.currentThread().getName() + ": " + message);
	}

// ***************************************** change commented code here to make it synchronized
	private void makeWithdrawal(int withdrawalAmount) {
//  private synchronized void makeWithdrawal(int withdrawalAmount) {
		if (this.getBalance() >= withdrawalAmount) {
			this.printMessage("Withdrawing $" + withdrawalAmount + " from account with balance of $" + this.balance);
			try {
				this.printMessage("sleeping...");
				Thread.sleep(500);   // force errors
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.withdraw(withdrawalAmount);
			this.printMessage("Withdrawal completed. Balance = $" + this.balance);
		}
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			this.printMessage("---------------------Withdrawal attempt #" + (i + 1));
			this.makeWithdrawal(10);
			if (this.getBalance() == 0) {
				this.printMessage("Account has no money.");
			}
			if (this.getBalance() < 0) {
				this.printMessage("Account is overdrawn. Balance is $" + this.balance);
			}
		}
	}

	public static void main(String[] args) {
		NonSynchronizedBankAccount account = new NonSynchronizedBankAccount();
		Thread one = new Thread(account);
		Thread two = new Thread(account);
		one.setName("Fred");
		two.setName("Lucy");
		one.start();
		two.start();
	}
}
