abstract class Player {	//�߻� Ŭ����(�̿ϼ� Ŭ����, �̿ϼ� ���赵)
	abstract void play(int pos);	//�߻�޼���(�̿ϼ� �޼���)
	abstract void stop();			//���߻� �޼���(����θ� �ְ� ������{}�� ���� �޼���
	
}

//�߻� Ŭ������ ����� ���� �ϼ��ؾ� ��ü ���� ����.
class AudioPlayer extends Player {
	void play(int pos) {System.out.println(pos + "��ġ���� play�մϴ�.");}
	void stop() {System.out.println("����� ����ϴ�.");}
}



public class Ex3_2 {

	public static void main(String[] args) {
		// �߻� Ŭ����
//		Player p = new Player();	//�߻� Ŭ������ ��ü�� ����
		Player ap = new AudioPlayer();		//������
		ap.play(100);
		ap.stop();
		
		
	}

}

















