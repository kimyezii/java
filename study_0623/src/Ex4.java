
public class Ex4 {

	public static void main(String[] args) {
		// ��� - ������ Ŭ������ ���ο� Ŭ������ �ۼ��ϴ� ��.
		// �� Ŭ������ �θ�� �ڽ����� ���踦 �ξ��ִ� ��.
		
		SmartTv stv = new SmartTv();
		stv.channel = 10;		// ���� Ŭ�����κ��� ��ӹ��� ���
		stv.channelUp();		// ���� Ŭ�����κ��� ��ӹ��� ���
		System.out.println(stv.channel);
		stv.displayCaption("Hello,world");
		stv.caption = true;		// ĸ��(�ڸ�) ����� �Ҵ�.
		stv.displayCaption("Hello,world");
	}

}
class Tv {
	boolean power;		//�������� on/off
	int channel;		//ä��
	
	void power()	{power = !power;}
	void channelUp()	{++channel;}
	void channelDown()	{--channel;}
}

class SmartTv extends Tv {		// SmartTv�� Tv�� ĸ��(�ڸ�)�� �����ִ� ����� �߰�
	boolean caption;			//ĸ�ǻ��� on/off
	void displayCaption(String text) {
		if(caption) {		// ĸ�� ���°� on(true)�� ���� text�� ���� �ش�.
			System.out.println(text);
		}
	}
}
