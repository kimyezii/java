
public class Ex4_5 {

	public static void main(String[] args) {
		// ������ for���� while������ �����Ͻÿ�
//			for(int i=0; i<=10; i++) {
//				for(int j=0; j<=i; j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//				
//			}

		
		
		int i = 0;		//�ʱ�ȭ

		while (i <= 10) {	//���ǽ�

			int j = 0;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;		//������
		}

	}

}
