package study_0706;

public class Ex9_5 {

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));

	}

	public static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src.length());
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			// ch�� delCh�� ���Ե����� ������(indexOf()�� ��ã����) sb�� �߰�
			if (delCh.indexOf(ch) == -1) // indexOf(int ch)�� ȣ��
				sb.append(ch);
		}
		return sb.toString(); // StringBuffer�� ����� ������ String���� ��ȯ
	}

}
