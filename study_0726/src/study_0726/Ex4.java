package study_0726;
//ch15-31 File ex2)

import java.io.File;

public class Ex4 {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("USAGE : java Ex4 DIRECTORY");
			System.exit(0);
		}

		File f = new File(args[0]);

		if (!f.exists() || !f.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
			System.exit(0);
		}

		File[] files = f.listFiles();

		for (int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "[" + fileName + "]" : fileName);
		}

	}

}
