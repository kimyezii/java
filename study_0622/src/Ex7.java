public class Ex7 {

	public static void main(String[] args) {
		//�����ε� - �� Ŭ���� �ȿ� ���� �̸��� �޼��带 ������ �����ϴ� ��.
		
		//�����ε� ���� ����
		//1.�޼��� �̸��� ���ƾ� �Ѵ�.
		//2.�Ű������� ���� �Ǵ� Ÿ���� �޶�� �Ѵ�.
		//3.��ȯ Ÿ���� �������.
		
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3,3) ���: "+mm.add(3,3));
		System.out.println("mm.add(3L,3) ���: "+mm.add(3L,3));
		System.out.println("mm.add(3,3L) ���: "+mm.add(3,3L));
		System.out.println("mm.add(3L,3L) ���: "+mm.add(3L,3L));
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) ���: " + mm.add(a));
		
	}
	
}
//�����ε��� �ùٸ� �� - �Ű������� �ٸ����� ���� �ǹ��� ��� ����
class MyMath3 {
	//�����ε�1
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	//�����ε�2
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	//�����ε�3
	int add(int[] a) {		//�迭�� ��� ����� ���� ����� �����ش�.
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i<a.length; i++)
			result += a[i];
		
		return result;
	}
}