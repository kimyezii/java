import java.util.Scanner;

public class ScanfEx1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("첫번째로 입력할 값을 쓰시오: ");
//		int num = scanner.nextInt();
//		System.out.print("두번째로 입력할 값을 쓰시오: ");
//		int num2 = scanner.nextInt();
//		System.out.println("첫번째 입력값: "+num);
//		System.out.println("두번째 입력값: "+num2);
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		System.out.println(num);
		
		
	}

}
