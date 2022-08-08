package study_0808;

import java.util.List;
import java.util.Scanner;

//0. 실행 후 Scanner 를 돌면서 대기하고 있는다.
//1.파일을 읽어서 CertificationItems 를 들고있고
//2. 명령 받는 것을 기다리고 있는다.
//3. 검색, 추가, 수정, 삭제 등의 명령을 수행한다.
//4. help (사용법)을 출력한다.
//5. exit 명령이 입력되면 종료한다.

public class CertificationSystem {
	List<CertificationItem> certificationItems;

	public static void main(String[] args) {
		CertificationSystem system = new CertificationSystem();
		system.waiting();
	}

	// 0.실행 후 Scanner를 돌면서 대기하고 있는다.
	// 2.명령 받는 것을 기다리고 있는다.
	public void waiting() {
		System.out.println("-------------------- 안녕하세요. CertificationSystem  --------------------");
		System.out.println("-------------------- 명령어를 입력하십시오 --------------------");

		while (true) {
			Scanner scanner = new Scanner(System.in);
			String cmd = scanner.next();

			System.out.println("cmd=" + cmd);
			if ("help".equals(cmd)) {
				printHelp();
			} else if ("read".equals(cmd)) {
				CertificationItemReader reader = new CertificationItemReader();
				certificationItems = reader.readCertificationItem();
			} else if ("exit".equals(cmd)) {
				System.out.println("-------------------- 종료합니다 --------------------");
				break;
			} else if ("search".equals(cmd)) {
				System.out.println("-------------------- 검색합니다. --------------------");
			} else if ("print".equals(cmd)) {
				System.out.println("-------------------- 프린트합니다. --------------------");
				this.printItems(this.certificationItems);
			} else {
				printHelp();
			}
		}
	}

	// 파일을 읽어서 CertificationItems를 들고 있고
	public void search() {
	}

	// 3. 검색, 추가, 수정, 삭제 등의 명령을 수행한다.
	public void read() {
	}

	// help(사용법)을 출력한다.
	public void printHelp() {
		System.out.println("-------------------- 사용법 --------------------");
		System.out.println("help : 메뉴얼 출력");
		System.out.println("exit : 종료");
		System.out.println("read : 파일을 읽는다.");
		System.out.println("search 필드명 검색어 : 주어진 검색 필드에서 검색어를 검색 후 목록 출력");
		System.out.println("-------------------- 사용법 --------------------");

	}

	public void printItems(List<CertificationItem> items) {
		if (items == null) {
			System.out.println(" 리스트가 비어있습니다.");
			return;
		}
		for (int i = 0; i < items.size(); i++) {
			System.out.println(items.get(i).toString());
		}
	}

}
