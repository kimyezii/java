package study_0726;
//ch15-28 ǥ�� ������� ��󺯰�

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex2 {

	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("test.txt");
			ps = new PrintStream(fos);
			System.setOut(ps);	//System.out�� ��´���� test.txt���Ϸ� ����
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		System.out.println("Hello by System.out");
		System.out.println("Hello by System.err");

	}

}
