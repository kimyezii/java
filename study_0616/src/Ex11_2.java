import java.security.KeyStore.TrustedCertificateEntry;
import java.util.Scanner;

public class Ex11_2 {

	public static void main(String[] args) {
		// continue
		
		int menu, num = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) squareRoot");
			System.out.println("(3) log");
			System.out.print("���ϴ� �޴�1~3�� �����ϼ���.(����:0): ");
			
			String tmp = scanner.nextLine();	//�Է��� �� tmp�� ����
			menu = Integer.parseInt(tmp);		//�Է¹��� ���ڿ�tmp�� ���ڷ� ��ȯ
			
			if(menu==0) {
				System.out.println("���α׷� ����");
				break;
			}else if (!(1 <= menu && menu <= 3)) {
				System.out.println("�޴��� �߸�������.�����0 : ");
				continue;
			}
			
			System.out.println("�����Ͻ� �޴��� "+ menu + "���Դϴ�.");
			
		}
		
		
		
		
		
		
		
		
		
	}

}
