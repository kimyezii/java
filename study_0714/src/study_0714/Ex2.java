package study_0714;

public class Ex2 {
//표준애너테이션-@Override,@Deprecated....
	public static void main(String[] args) {
		Child c = new Child();
		c.parentMethod();//Deprecated된 메서드
		
	}

}
class Parent {
	void parentMethod() { }
}
class Child extends Parent {
	@Override
	@Deprecated
	void parentMethod() { } // 조상 메서드의 이름을 잘못 적었음. @Override를 하면 알려줌
}

