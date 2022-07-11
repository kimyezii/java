package study_0712;

import java.util.*;

public class Ex11_6 {
//숫자들의 위치가 잘 섞이지 않는다. 이것을 개선하시오.
	public static void main(String[] args) {
		Set set = new HashSet();
		int[][] board = new int[5][5];
		
		for (int i = 0; set.size() < 25; i++) {
			set.add((int) (Math.random() * 30) + 1 + "");
		}
		
		ArrayList list = new ArrayList(set);	//set과 같은 데이터를 가진 ArrayList를 생성
		Collections.shuffle(list);				//list에 저장된 데이터의 순서를 섞는다.
		
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
