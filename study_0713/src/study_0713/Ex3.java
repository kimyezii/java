package study_0713;
//���׸������, ���׸� Ÿ�԰� ������

import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv3>      tvList = new ArrayList<Tv3>();
//  	ArrayList<Product> tvList = new ArrayList<Tv3>(); // ����.
// 		List<Tv3>           tvList = new ArrayList<Tv3>(); // OK. ������

		productList.add(new Tv3());
		productList.add(new Audio3());

		tvList.add(new Tv3());
		tvList.add(new Tv3());

		printAll(productList);
		// printAll(tvList); // ������ ������ �߻��Ѵ�.
	}

	public static void printAll(ArrayList<Product> list) {
		for (Product p : list)
			System.out.println(p);
	}

}
class Product {}
class Tv3 extends Product {}
class Audio3 extends Product {}
