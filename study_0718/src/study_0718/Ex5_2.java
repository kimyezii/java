package study_0718;

public class Ex5_2 {
//쓰레드의 동기화
	//동기화가 된 버전
	public static void main(String[] args) {
		//synchronized를 이용한 동기화
		
		Runnable r = new RunnableEx5();
		new Thread(r).start();
		new Thread(r).start();
	}

}
class Account2 {
	private int balance = 1000;		//private으로 해야 동기화가 의미가 있다.
				//ㄴ잔고
	
	public int getBalance() {
		return balance;
	}
	
	//임계영역
	public synchronized void withdraw(int money) {	//synchronized로 메서드를 동기화
								//ㄴ출금
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			
			balance -= money;
		}
	} //withdraw
}
class RunnableEx5 implements Runnable {
	Account2 acc = new Account2();
	
	public void run() {
		while(acc.getBalance() > 0) {
			//100, 200, 300중의 한 값을 임의로 선택해서 출금(withdraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance:"+acc.getBalance());
		}
	}//run()
}