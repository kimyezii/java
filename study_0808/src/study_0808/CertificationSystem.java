package study_0808;

import java.util.List;
import java.util.Scanner;

//0. ���� �� Scanner �� ���鼭 ����ϰ� �ִ´�.
//1.������ �о CertificationItems �� ����ְ�
//2. ��� �޴� ���� ��ٸ��� �ִ´�.
//3. �˻�, �߰�, ����, ���� ���� ����� �����Ѵ�.
//4. help (����)�� ����Ѵ�.
//5. exit ����� �ԷµǸ� �����Ѵ�.

public class CertificationSystem {
	List<CertificationItem> certificationItems;

	public static void main(String[] args) {
		CertificationSystem system = new CertificationSystem();
		system.waiting();
	}

	// 0.���� �� Scanner�� ���鼭 ����ϰ� �ִ´�.
	// 2.��� �޴� ���� ��ٸ��� �ִ´�.
	public void waiting() {
		System.out.println("-------------------- �ȳ��ϼ���. CertificationSystem  --------------------");
		System.out.println("-------------------- ��ɾ �Է��Ͻʽÿ� --------------------");

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
				System.out.println("-------------------- �����մϴ� --------------------");
				break;
			} else if ("search".equals(cmd)) {
				System.out.println("-------------------- �˻��մϴ�. --------------------");
			} else if ("print".equals(cmd)) {
				System.out.println("-------------------- ����Ʈ�մϴ�. --------------------");
				this.printItems(this.certificationItems);
			} else {
				printHelp();
			}
		}
	}

	// ������ �о CertificationItems�� ��� �ְ�
	public void search() {
	}

	// 3. �˻�, �߰�, ����, ���� ���� ����� �����Ѵ�.
	public void read() {
	}

	// help(����)�� ����Ѵ�.
	public void printHelp() {
		System.out.println("-------------------- ���� --------------------");
		System.out.println("help : �޴��� ���");
		System.out.println("exit : ����");
		System.out.println("read : ������ �д´�.");
		System.out.println("search �ʵ�� �˻��� : �־��� �˻� �ʵ忡�� �˻�� �˻� �� ��� ���");
		System.out.println("-------------------- ���� --------------------");

	}

	public void printItems(List<CertificationItem> items) {
		if (items == null) {
			System.out.println(" ����Ʈ�� ����ֽ��ϴ�.");
			return;
		}
		for (int i = 0; i < items.size(); i++) {
			System.out.println(items.get(i).toString());
		}
	}

}
