package study_0705;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Ex11 {

	public static void main(String[] args) {
		// ����ȭŬ����

		DecimalFormat df  = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");

		try {
			Number num = df.parse("1,234,567.89");
			System.out.print("1,234,567.89" + " -> ");

			double d = num.doubleValue(); 	// d = 1234567.89
			System.out.print(d + " -> ");

			System.out.println(df2.format(num));
		} catch(Exception e) {}
	}
//���� ���ڿ� -> ����	= parse
//���� -> ���� ���ڿ�	= format

}
