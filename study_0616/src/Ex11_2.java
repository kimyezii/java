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
			System.out.print("원하는 메뉴1~3를 선택하세요.(종료:0): ");
			
			String tmp = scanner.nextLine();	//입력한 값 tmp에 저장
			menu = Integer.parseInt(tmp);		//입력받은 문자열tmp를 숫자로 변환
			
			if(menu==0) {
				System.out.println("프로그램 종료");
				break;
			}else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못선택함.종료는0 : ");
				continue;
			}
			
			System.out.println("선택하신 메뉴는 "+ menu + "번입니다.");
			
		}
		
		
		
		
		
		
		
		
		
	}

}
