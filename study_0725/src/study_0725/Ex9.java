package study_0725;

import java.io.*;

//ch15-25 InputStreamReader, OutputStreamWriter

class Ex9 {

	public static void main(String[] args) {
		String line = "";

		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			System.out.println("������� OS�� ���ڵ� :" + isr.getEncoding());

			do {
				System.out.print("������ �Է��ϼ���. ��ġ�÷��� q�� �Է��ϼ���.>");
				line = br.readLine();
				System.out.println("�Է��Ͻ� ���� : " + line);
			} while (!line.equalsIgnoreCase("q"));

			System.out.println("���α׷��� �����մϴ�.");
		} catch (IOException e) {
		}

	}

}
