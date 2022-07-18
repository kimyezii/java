package study_0718;

public class Ex3 {
//suspend() resume()
	public static void main(String[] args) {
		MyThread th1 = new MyThread("*");
		MyThread th2 = new MyThread("**");
		MyThread th3 = new MyThread("***");
		th1.start();
		th2.start();
		th3.start();
		//순서는 뒤바낄수있음. 쓰레드 특징. 

		try {
			Thread.sleep(2000);
			th1.suspend(); // 쓰레드 th1을 잠시 중단시킨다.
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume(); // 쓰레드 th1이 다시 동작하도록 한다.
			Thread.sleep(3000);
			th1.stop(); // 쓰레드 th1을 강제종료시킨다.
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {
		}

	}

}

class MyThread implements Runnable {
	volatile boolean suspended = false;	//쉽게 바뀌는 변수
	volatile boolean stopped = false;
	
	Thread th;
	
	MyThread(String name) {
		th = new Thread(this, name); //Thread(Runnable r, String name)
	}
	
	void start() {
		th.start();
	}
	
	void stop() {
		stopped = true;
	}
	
	void suspend() {
		suspended = true;
	}
	
	void resume() {
		suspended = false;
	}
	
	public void run() {
		while (!stopped) {
			if(!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		}
	} // run()
}