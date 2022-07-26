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
				//사용자로부터 입력받은 이름의 파일이 존재하는지, 디렉토리는 아닌지 확인해야한다.

				String line = "";
				int i = 1;

				//입력받은 라인 수 만큼만 파일의 내용을 라인화면에 출력
				while ((line = br.readLine()) != null && i <= lineNum) {
					//line = br.readLine(): readLine()으로 읽은 문자열을 line에 저장. *readLine()은 더 이상 읽을 라인이 없으면 null을 반환.
					//line != null : line에 저장된 값이 null이 아닌지 비교.
					System.out.println(i + ":" + line);
					i++;
				}
			} else {
				throw new FileNotFoundException(fileName + "은/는 디렉토리이거나, 존재하지 않는 파일입니다.");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("USAGE: java FileHead 10 FILENAME");
		}

	}

}
