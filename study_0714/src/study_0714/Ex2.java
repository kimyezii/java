package study_0714;

public class Ex2 {
//ǥ�ؾֳ����̼�-@Override,@Deprecated....
	public static void main(String[] args) {
		Child c = new Child();
		c.parentMethod();//Deprecated�� �޼���
		
	}

}
class Parent {
	void parentMethod() { }
}
class Child extends Parent {
	@Override
	@Deprecated
	void parentMethod() { } // ���� �޼����� �̸��� �߸� ������. @Override�� �ϸ� �˷���
}

