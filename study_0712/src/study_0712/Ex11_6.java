package study_0712;

import java.util.*;

public class Ex11_6 {
//���ڵ��� ��ġ�� �� ������ �ʴ´�. �̰��� �����Ͻÿ�.
	public static void main(String[] args) {
		Set set = new HashSet();
		int[][] board = new int[5][5];
		
		for (int i = 0; set.size() < 25; i++) {
			set.add((int) (Math.random() * 30) + 1 + "");
		}
		
		ArrayList list = new ArrayList(set);	//set�� ���� �����͸� ���� ArrayList�� ����
		Collections.shuffle(list);				//list�� ����� �������� ������ ���´�.
		
//		Iterator it = set.iterator();
		Iterator it = list.iterator();
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String) it.next());
				System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
			}
			System.out.println();
		}

	}

}
