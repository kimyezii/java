package study_0714;

import javax.swing.JOptionPane;
//�̱� ������� ��Ƽ ������, �������� I/O ���ŷ
public class Ex8 {

	public static void main(String[] args) {
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();

		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���."); 
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");

	}

}

class ThreadEx5_1 extends Thread {
	public void run() {
		for(int i=10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch(Exception e ) {}
		}
	} // run()
}