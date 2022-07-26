package study_0727;

import java.io.*;

class Ex15_1 {

	public static void main(String[] args) {
		try {
			int lineNum = Integer.parseInt(args[0]);
			String fileName = args[1];

			File f = new File(fileName);

			if (f.exists() && !f.isDirectory()) {
				BufferedReader br = new BufferedReader(new FileReader(fileName));
				//����ڷκ��� �Է¹��� �̸��� ������ �����ϴ���, ���丮�� �ƴ��� Ȯ���ؾ��Ѵ�.

				String line = "";
				int i = 1;

				//�Է¹��� ���� �� ��ŭ�� ������ ������ ����ȭ�鿡 ���
				while ((line = br.readLine()) != null && i <= lineNum) {
					//line = br.readLine(): readLine()���� ���� ���ڿ��� line�� ����. *readLine()�� �� �̻� ���� ������ ������ null�� ��ȯ.
					//line != null : line�� ����� ���� null�� �ƴ��� ��.
					System.out.println(i + ":" + line);
					i++;
				}
			} else {
				throw new FileNotFoundException(fileName + "��/�� ���丮�̰ų�, �������� �ʴ� �����Դϴ�.");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("USAGE: java FileHead 10 FILENAME");
		}

	}

}
