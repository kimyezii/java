package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent {
	public void printMembers() {
//		System.out.println(prv);	//����
//		System.out.println(dft);	//����
		System.out.println(prt);	//ok �ڼ�(�ٸ� ��Ű��)
		System.out.println(pub);	//ok
	}	
}

public class MyParentTest2 {

	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv);	//���� (�ٸ� Ŭ����)
//		System.out.println(p.dft);	//����	
//		System.out.println(p.prt);	//����
		System.out.println(p.pub);	//ok

	}

}
