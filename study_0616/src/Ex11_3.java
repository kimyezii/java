import java.security.KeyStore.TrustedCertificateEntry;
import java.util.Scanner;

public class Ex11_3 {

	public static void main(String[] args) {
		// �̸����� �ݺ���
		
		Loop1 : for(int i=2; i<=9; i++) {
				for(int j=2; j<=9; j++) {
					if(j==5)
						break Loop1;
	//					break;
	//					continue Loop1;
	//					continue
					System.out.println(i+"*"+j+"="+i*j);
				} //for�� i ��
				System.out.println();
				
		}	// Loop1 ��
		
		
	}

}
