import java.util.Scanner;

public class ScanfEx1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("ù��°�� �Է��� ���� ���ÿ�: ");
//		int num = scanner.nextInt();
//		System.out.print("�ι�°�� �Է��� ���� ���ÿ�: ");
//		int num2 = scanner.nextInt();
//		System.out.println("ù��° �Է°�: "+num);
//		System.out.println("�ι�° �Է°�: "+num2);
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		System.out.println(num);
		
		
	}

}
