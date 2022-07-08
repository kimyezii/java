package study_0708;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex10_4 {

	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2000, 0, 1);	//2000�� 1�� 1�Ϸ� ��¥�� �����Ѵ�.
		date2.set(2016, 0, 26);	//2016�� 1�� 29�Ϸ� ��¥�� �����Ѵ�.
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		System.out.println("birth day=" + df.format(new Date(date1.getTimeInMillis())));
		System.out.println("todat	=" + df.format(new Date(date2.getTimeInMillis())));
		
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println(difference/(24*60*60) + "days");		//1�� = 24*60*60
	}

}
