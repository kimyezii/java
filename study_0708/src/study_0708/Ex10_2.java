package study_0708;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex10_2 {

	public static void main(String[] args) {
		String pattern = "YYYY/MM/dd";
		String pattern2 = "�Է��Ͻ� ��¥�� E�����Դϴ�.";	//'E'�� ��~�� ���� �ϳ��� ��.
		
		DateFormat df = new SimpleDateFormat(pattern);
		DateFormat df2 = new SimpleDateFormat(pattern2);
		
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		
		do {
			System.out.println("��¥�� "+pattern+"�� ���·� �Է����ּ���.(�Է¿�:2017/05/11)");
			
			try {
				System.out.print(">>");
				inDate = df.parse(s.nextLine());	//�Է¹��� ��¥�� Date�� ��ȯ�Ѵ�.
				break;	//parse()���� ���ܰ� �߻��ϸ� �� ������ ������� �ʴ´�.
			} catch (Exception e) {
				
			}
		} while (true);

		System.out.println(df2.format(inDate));
	}

}
