class Data { int x;}
public class Ex2 {

	public static void main(String[] args) {
		//	기본형매개변수
		
		//  기본형매개변수 - 변수의 값을 읽기만 할 수 있다. (read only)
		//	참조형매개변수 - 변수의 값을 읽고 변경할 수 있다. (read&write) 

		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
		
	}
	
	static void change(int x) {	//기본형 매개변수
		x = 1000;		//지역변수
		System.out.println("change() : x " + x);
	}

}
