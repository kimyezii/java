package study_0718;

public class Ex1 {
//sleep()
	public static void main(String[] args) {
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		th1.start();
		th2.start();

		try {
//			th1.sleep(2000);	//main을 2초동안 잠자게 하기.
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}

		System.out.print("<<main 종료>>");

	}

}

class ThreadEx8_1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++)
			System.out.print("-");
		System.out.print("<<th1 종료>>");
	} // run()
}

class ThreadEx8_2 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++)
			System.out.print("|");
		System.out.print("<<th2 종료>>");
	} // run()
}