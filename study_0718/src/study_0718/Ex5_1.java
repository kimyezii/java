package study_0718;

public class Ex5_1 {
//�������� ����ȭ
	// ����ȭ�� �Ǿ����� ���� ���� - �ܰ� ���̳ʽ� ����(��� ����ϸ� ����)
	public static void main(String[] args) {
		Runnable r = new RunnableEx5_1();
		new Thread(r).start();
		new Thread(r).start();
	}

}

class Account {
	private int balance = 1000; // private���� �ؾ� ����ȭ�� �ǹ̰� �ִ�.

	public int getBalance() {
		return balance;
	}

	public void withdraw(int money) { 
//		public synchronized void withdraw(int money) {// synchronized�� �޼��带 ����ȭ
		if (balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			balance -= money;
		}
	} // withdraw
}

class RunnableEx5_1 implements Runnable {
	Account acc = new Account();

	public void run() {
		while (acc.getBalance() > 0) {
			// 100, 200, 300���� �� ���� ������ �����ؼ� ���(withdraw)
			int money = (int) (Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance:" + acc.getBalance());
		}
	} // run()
}