package study_0711;

import java.util.*;

//HashMap
public class Ex10 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
//		System.out.println(map);
		map.put("asdf", "1234");
//		System.out.println(map);

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("id�� password�� �Է����ּ���.");
			System.out.print("id :");
			String id = s.nextLine().trim();

			System.out.print("password :");
			String password = s.nextLine().trim();
			System.out.println();

			if (!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ֽʽÿ�.");
				continue;
			}

			if (!(map.get(id)).equals(password)) {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
			} else {
				System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");
				break;
			}
		} // while
	}

}
