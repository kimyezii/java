
public class Ex1_1 {

	public static void main(String[] args) {
		// 2���� �迭 Ex5_8
		int[][] score = {
				{100,100,100},
				{20,20},
				{30,30,30,30},
				{40}
		};
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d\n", i , j, score[i][j]);
				
				sum += score[i][j];
			}
		}
		System.out.println("sum=" + sum);
	}

}
