import java.util.Scanner;

public class Ex4_10 {

	public static void main(String[] args) {
//		다음은 숫자맞추기 게임을 작성한 것이다 1과 100사이의 값을 반복적으로 입력해서 
//		컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 사용자가 값을 입력하면 컴퓨터는 자신이 생각한 값과 
//		비교해서 결과를 알려준다. 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 
//		몇 번 만에 숫자를 맞췄는지 알려준다. 
		
		
//		1~100사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int)(Math.random()*100)+1;
		int input = 0;				//사용자입력을 저장할 공간
		int count = 0;				//시도횟수를 세기위한 변수
		
		//화면으로부터 사용자입력을 받기 위해서 Scanner클래스 사용
		Scanner sc = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			input = sc.nextInt();		//입력받은 값을 변수 input에 저장한다.
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			}else if(answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			}else {
				System.out.println("정답입니다.");
				System.out.println("시도횟수는 "+ count + "번 입니다.");
				break;			//do-while문을 벗어난다.
			}
			
		}
		while(true);	//무한반복문
		
		
			
			
			
			
//		//1.각 변에 100을 곱한다.
//		0.0 * 100 <= 	Math.random() * 100 < 1.0 * 100
//			0.0<= Math.random() * 100 < 100.0
//		
		
//		//2.각 변을 int형으로 반환한다.
//		(int)0.0 <= (int)(Math.random()*100) < (int)100.0
//			  0 <= (int)(Math.random()*100) < 100
//		
		
//		//3.각 변에 1을 더한다.
//		0 + 1 <= (int)(Math.random()*100) + 1 < 100 + 1
//		   1  <= (int)(Math.random()*100) + 1 < 101
			
			
			
	}

}
