package study_0714;

public class Ex4 {
// �������Ǳ����� ����
	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();

		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);	  // ������ Thread(Runnable target)

		t1.start();
		t2.start();

	}

}
class ThreadEx1_1 extends Thread {//1.ThreadŬ������ ����ؼ� �����带 ����
	public void run() {		//�����尡 ������ �۾��� �ۼ�
		for(int i=0; i < 5; i++) {
			System.out.println(getName()); // ������ Thread�� getName()�� ȣ��
//								��(this.getName()) this����
		}
	}
}

class ThreadEx1_2 implements Runnable {//2.Runnable�������̽��� �����ؼ� �����带 ����
	public void run() {		//�����尡 ������ �۾��� �ۼ�
		for(int i=0; i < 5; i++) {
			// Thread.currentThread() - ���� �������� Thread�� ��ȯ�Ѵ�.
			System.out.println(Thread.currentThread().getName());
		}
	}
}