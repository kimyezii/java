package study_0713;
//지네릭스용어, 지네릭 타입과 다형성

import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv3>      tvList = new ArrayList<Tv3>();
//  	ArrayList<Product> tvList = new ArrayList<Tv3>(); // 에러.
// 		List<Tv3>           tvList = new ArrayList<Tv3>(); // OK. 다형성

		productList.add(new Tv3());
		productList.add(new Audio3());

		tvList.add(new Tv3());
		tvList.add(new Tv3());

		printAll(productList);
		// printAll(tvList); // 컴파일 에러가 발생한다.
	}

	public static void printAll(ArrayList<Product> list) {
		for (Product p : list)
			System.out.println(p);
	}

}
class Product {}
class Tv3 extends Product {}
class Audio3 extends Product {}
