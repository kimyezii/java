package study_0708;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex10_1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 0, 1);	//cal�� ��¥�� 2020�� 1�� 1�Ϸ� ����
		
		for(int i=0; i<12; i++) {
			int weekday = cal.get(Calendar.DAY_OF_WEEK);	//1���� ������ ���Ѵ�.
			
			//�ι�° �Ͽ����� 1���� ���Ͽ� ���� �޶�����.
			//1���� �Ͽ����� ��쿡�� �ι�° �Ͽ����� 8���̰�
			//1���� �ٸ� ������ ���� 16���� 1���� ����(weekday)�� ���� �� �� �ִ�.
			int secondSunday = (weekday == 1) ? 8 : 16 - weekday;
			
			//��1 ��2 ȭ3 ��4 ��5 ��6 ��8
			//1���� ������ �������̸� 2 + �ι�°�Ͽ���14 = 16
			//1���� ������ �ݿ����̸� 6 + �ι�°�Ͽ���10 = 16
			
			
			//�ι�° �Ͽ���(secondSunday)�� cal�� ��¥ (DAY_OF_MONTH)�� �ٲ۴�.
			cal.set(Calendar.DAY_OF_MONTH , secondSunday);
			
			Date d = cal.getTime();		//Calendar�� Date�� ��ȯ�Ѵ�.
			System.out.println(new SimpleDateFormat("YYYY-MM-dd�� F��° E�����Դϴ�.").format(d));
			
			//��¥�� ������ 1�Ϸ� �����Ѵ�.
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH, 1);
			
		}

	}

}
