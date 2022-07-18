package study_0718;

public class Ex5_2 {
//�������� ����ȭ
	//����ȭ�� �� ����
	public static void main(String[] args) {
		//synchronized�� �̿��� ����ȭ
		
		Runnable r = new RunnableEx5();
		new Thread(r).start();
		new Thread(r).start();
	}

}
class Account2 {
	private int balance = 1000;		//private���� �ؾ� ����ȭ�� �ǹ̰� �ִ�.
				//���ܰ�
	
	public int getBalance() {
		return balance;
	}
	
	//�Ӱ迵��
	public synchronized void withdraw(int money) {	//synchronized�� �޼��带 ����ȭ
								//�����
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
			//100, 200, 300���� �� ���� ���Ƿ� �����ؼ� ���(withdraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance:"+acc.getBalance());
		}
	}//run()
}