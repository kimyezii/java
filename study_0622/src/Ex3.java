class Data2 { int x;}
public class Ex3 {

	public static void main(String[] args) {
		//	참조형매개변수
		
		//  기본형매개변수 - 변수의 값을 읽기만 할 수 있다. (read only)
		//	참조형매개변수 - 변수의 값을 읽고 변경할 수 있다. (read&write) 

		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data2 d) {	//참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}
