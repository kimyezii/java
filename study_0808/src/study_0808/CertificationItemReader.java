package study_0808;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

public class CertificationItemReader {
	// 파일을 한 줄씩 읽는다.
	// 줄 단위로 \t로 잘라서 item을 생성한다.
	// 생성된 item을 items에 add한다.
	// 다 읽었으면 items를 return한다.

	public List<CertificationItem> readCertificationItem() {
		List<CertificationItem> items = new LinkedList<>();
		System.out.println("-------------------- CertificationItemReader.파일을 읽습니다. --------------------");
		String filePath = "C:\\Users\\YEJI\\eclipse-workspace\\study_0808\\items.txt";

		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(filePath), "UTF8"))) {
			String lineStr;
			int i = 0;
			while ((lineStr = br.readLine()) != null) {
				i++;
				if (i == 1) {
					continue;
				}
				System.out.println(lineStr);
				String[] splited = lineStr.split("\t");

				CertificationItem item = new CertificationItem();
				item.setNo(splited[0]);
				item.setTypeName(splited[1]);
				item.setFarm(splited[2]);
				item.setName(splited[3]);
				item.setCultivationArea(Integer.getInteger(splited[4]));
				item.setPlan(Integer.getInteger(splited[5]));
				if (splited.length > 6) {
					item.setStartData(splited[6]);
				}
				if (splited.length > 7) {
					item.setEndData(splited[7]);
				}
				if (splited.length > 8) {
					item.setRawMaterialCertificationClassification(splited[8]);
				}
				items.add(item);
				if (i >= 100) {
					break;
				}
			}
			return items;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return items;
	}

}
