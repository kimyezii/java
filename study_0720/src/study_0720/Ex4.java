package study_0720;

import java.util.function.Function;
import java.util.function.Supplier;

//생성자의 메서드 참조
public class Ex4 {

	public static void main(String[] args) {
		//Supplier는 입력X, 출력O
//		Supplier<MyClass> s = () -> new MyClass();
//		Supplier<MyClass> s = MyClass::new;
		
//		Function<Integer,MyClass> f = (i) -> new MyClass(i);
		Function<Integer,MyClass> f = MyClass::new;
		
		
		MyClass mc = f.apply(100);
		System.out.println(mc.iv);
		
		System.out.println(f.apply(200).iv);
		
		Function<Integer, int[]> f2 = (i) -> new int[i];
		// ==
//		Function<Integer, int[]> f2 = int[i]::new;	//메서드참조
//		Function<Integer, int[]> f2 = 클래스이름::메서드이름;
		
		int[] arr = f2.apply(100);
		
		System.out.println("arr.length="+arr.length);
		

	}

}
class MyClass {
	int iv;
	
	MyClass(int iv) {
		this.iv = iv;
	}
}