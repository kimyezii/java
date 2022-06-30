class Outer {
	private int outerIv = 0;
	private static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv;		//1.�ܺ� Ŭ������ private����� ���ٰ����ϴ�.
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		//static Ŭ������ �ܺ� Ŭ������ �ν��Ͻ������ ������ �� ����.
		// int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod() {
		final int lv = 0;	//lv�� ��������, ���� �����ϴ� �ڵ尡 �����Ƿ� �����δ� ����� �ٸ� ����. -> ���� �ٲ��� �ʴ� ������ ����� ����
		final int LV = 0;	//JDK1.8���� final ��������
		
		class LocalInner {//2.���� ���� Ŭ������ ���ΰ� �ִ� �޼����� ����� ��밡��.
			int liv = outerIv;
			int liv2 = outerCv;
			//�ܺ� Ŭ������ ���������� final�� ���� ����(���)�� ���ٰ����ϴ�.
			int liv3 = lv;	//����(JDK1.8���� ���� �ƴ�)
			int liv4 = LV;		//ok
			
			void method() {
				System.out.println(lv);
			}
		}
	}
}
public class Ex1 {

	public static void main(String[] args) {
		
	}

}
