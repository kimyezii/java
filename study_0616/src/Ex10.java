import java.security.KeyStore.TrustedCertificateEntry;

public class Ex10 {

	public static void main(String[] args) {
		// break

		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100)
				break;
			++i;
			sum += i;
		}
		//break°¡ ¹þ¾î³­ °÷.
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}

}
