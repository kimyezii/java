package study_0718;

import javax.swing.JOptionPane;

public class Ex2 {
//interrupt() - 대기상태인 쓰레드를 실행대기 상태로 만듦.
	public static void main(String[] args) {
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();

		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
		th1.interrupt(); // interrupt()를 호출하면, interrupted상태가 true가 된다.
		System.out.println("isInterrupted():" + th1.isInterrupted()); // true
	}

}

class ThreadEx9_1 extends Thread {
	public void run() {
		int i = 10;

		while (i != 0 && !isInterrupted()) {
			System.out.println(i--);
			for (long x = 0; x < 2500000000L; x++)
				; // 시간 지연
		}
		System.out.println("카운트가 종료되었습니다.");
	}
}