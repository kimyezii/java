import java.io.File;
import java.io.IOException;

public class Ex1 {

	public static void main(String[] args) {
		// ���ܼ����ϱ�, finally��
//			File f = createFile(args[0]);	//Run -> configurations -> Arguments -> test.txt -> F5 �ڵ�����
			File f = createFile("");
			System.out.println(f.getName() + "������ ���������� �����Ǿ����ϴ�.");

	} // maim�޼ҵ� ��

	static File createFile(String fileName) { //throws Exception {
		try {
			if (fileName == null || fileName.equals("")) {
				throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
			}
		} catch (Exception e) {
			fileName = "�������.txt";
		}

		File f = new File(fileName); // FileŬ������ ��ü�� �����.
		// File��ü�� createNameFile�޼��带 �̿��ؼ� ���� ������ �����Ѵ�.
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f; // ������ ��ü�� ������ ��ȯ�Ѵ�.
	} // createFile�޼ҵ� ��

}