package study_0725;
//ch15-24 BufferedReader

import java.io.BufferedReader;
import java.io.FileReader;

class Ex8 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader(".\\src.\\study_0725\\Ex8.java");
			BufferedReader br = new BufferedReader(fr);

			String line = "";
			for (int i = 1; (line = br.readLine()) != null; i++) {
				if (line.indexOf(";") != -1) {
					System.out.println(i + ":" + line);
				}
			}
			br.close();
		} catch (Exception e) {
		}

	}

}
