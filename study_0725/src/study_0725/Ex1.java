package study_0725;
//ch15-11 FileInputStream/FileOutputStream ex1)

import java.io.*;

class Ex1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(".\\src\\Ex1.java");

		int data = 0;

		while ((data = fis.read()) != -1) {
			char c = (char) data;
			System.out.print(c);
		}
	}

}
