package study_0708;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex10_3 {

	public static void main(String[] args) {
		Calendar fromcal = Calendar.getInstance();
		Calendar tocal = Calendar.getInstance();
		
		fromcal.set(2020, 0, 1);
		tocal.set(2020, 0, 1);
		printResult(fromcal, tocal);
		
		fromcal.set(2020, 0, 21);
		tocal.set(2020, 0, 21);
		printResult(fromcal, tocal);
		
		fromcal.set(2020, 0, 1);
		tocal.set(2020, 2, 1);
		printResult(fromcal, tocal);
		
		fromcal.set(2020, 0, 1);
		tocal.set(2020, 2, 23);
		printResult(fromcal, tocal);
		
		fromcal.set(2020, 0, 23);
		tocal.set(2020, 2, 21);
		printResult(fromcal, tocal);
		
		fromcal.set(2021, 0, 22);
		tocal.set(2020, 2, 21);
		printResult(fromcal, tocal);
		
		
		

	}

	static int paycheckCount(Calendar from, Calendar to) {
		//1.from�Ǵ� to�� null�̸� 0�� ��ȯ�Ѵ�.
		if(from==null || to==null) {
			
			return 0;
		}
		
		//2.from�� to�� ���� ��¥�� 21���̸� 1�� ��ȯ�Ѵ�.
		if (from.equals(to) && from.get(Calendar.DAY_OF_MONTH)==21) {
			return 1;
		}
		
		int fromYear = from.get(Calendar.YEAR);
		int fromMon = from.get(Calendar.MONTH);
		int fromDay = from.get(Calendar.DAY_OF_MONTH);
		
		int toYear = to.get(Calendar.YEAR);
		int toMon = to.get(Calendar.MONTH);
		int toDay = to.get(Calendar.DAY_OF_MONTH);
		
		//3.to�� from�� �� ���� �������� ����ؼ� ���� monDiff�� ��´�.
		int monDiff = (toYear * 12 + toMon) - (fromYear * 12 + fromMon);
		
		//4.monDiff�� �����̸� 0�� ��ȯ�Ѵ�.
		if(monDiff < 0) return 0;
		
		//5.���� from�� ��(DAY_OF_MONTH)�� 21���̰ų� �����̰� 
		//to�� ��(DAY_OF_MONTH)�� 21���̰ų� �����̸� monDiff�� ���� 1 ������Ų��.
		if(fromDay <= 21 && toDay >= 21) {
			monDiff++;
		}
		
		//6.���� from�� �� (DAY_OF_MONTH)�� 21�� ���İ�
		//to�� ��(DAY_OF_MONTH)�� 21�� �����̸� monDiff�� ���� 1 ���ҽ�Ų��.
		if(fromDay >21 && toDay < 21) {
			monDiff--;
		}
		return monDiff;
	}
	
	static void printResult(Calendar from, Calendar to) {
		Date fromDate = from.getTime();
		Date toDate = to.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.print(sdf.format(fromDate)+"~" + sdf.format(toDate) + ":");
		System.out.println(paycheckCount(from, to));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
