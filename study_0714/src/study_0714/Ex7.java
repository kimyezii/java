package study_0714;

import javax.swing.JOptionPane;
//싱글 쓰레드와 멀티 쓰레드, 쓰레드의 I/O 블락킹
public class Ex7 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요."); 
		System.out.println("입력하신 값은 " + input + "입니다.");

		for(int i=10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);  // 1초간 시간을 지연한다.
			} catch(Exception e ) {}
		}

	}

}
