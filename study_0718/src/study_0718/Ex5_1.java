package study_0718;

public class Ex5_1 {
//쓰레드의 동기화
	// 동기화가 되어있지 않은 버전 - 잔고에 마이너스 찍힘(계속 출력하면 나옴)
	public static void main(String[] args) {
		Runnable r = new RunnableEx5_1();
		new Thread(r).start();
		new Thread(r).start();
	}

}

class Account {
	private int balance = 1000; // private으로 해야 동기화가 의미가 있다.

	public int getBalance() {
		return balance;
	}

	public void withdraw(int money) { 
//		public synchronized void withdraw(int money) {// synchronized로 메서드를 동기화
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
			// 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)
			int money = (int) (Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance:" + acc.getBalance());
		}
	} // run()
}