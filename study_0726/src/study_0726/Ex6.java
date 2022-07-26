package study_0726;
//ch15-33 File ex4)

import java.io.*;

public class Ex6 {

	public static void main(String[] args) {
		try {
			String fileName = "test.txt";
			FileInputStream fis = new FileInputStream(fileName);
			FileReader fr = new FileReader(fileName);

			int data =0;
			// FileInputStream�� �̿��ؼ� ���ϳ����� �о� ȭ�鿡 ����Ѵ�.
			while((data=fis.read())!=-1) {
				System.out.print((char)data);
			}
			System.out.println();
			fis.close();

			// FileReader�� �̿��ؼ� ���ϳ����� �о� ȭ�鿡 ����Ѵ�.
			while((data=fr.read())!=-1)
				System.out.print((char)data);
			System.out.println();
			fr.close();				
		} catch (IOException e) {
				e.printStackTrace();		
		}

	}

}
