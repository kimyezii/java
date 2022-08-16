import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CertificationItemReader {
    // 파일을 한 줄씩 읽는다.
    // 줄 단위로 \t로 잘라서 item을 생성한다.
    // 생성된 item을 items에 add한다.
    // 다 읽었으면 items를 return한다.
    static ArrayList<CertificationItem> list = new ArrayList<>();

    public List<CertificationItem> readCertificationItem() {
        List<CertificationItem> items = new LinkedList<>();
        System.out.println("-------------------- CertificationItemReader.파일을 읽습니다. --------------------");
        CertificationItem.certification();
        String filePath = "C:\\Users\\YEJI\\eclipse-workspace\\study_0808\\items.txt";

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath), "UTF8"))) {
            String str = "";
            String[] element;

            int i = 0;
            while ((str = br.readLine()) != null) {
                i++;
                if (i == 1) {
                    continue;
                }
                CertificationItem certificationItem = new CertificationItem();
                element = str.split("\t");
                certificationItem.setCertificationNo(element[0]);
                certificationItem.setCertificationTypeName(element[1]);
                certificationItem.setCertificationFarm(element[2]);
                certificationItem.setCertificationItemName(element[3]);
                certificationItem.setCultivationArea(element[4]);
                certificationItem.setProductionPlannedAmount(element[5]);
                certificationItem.setCertificationStartDate(element[6]);
                certificationItem.setCertificationEndDate(element[7]);
                if (element.length == 9) {
                    certificationItem.setRawMaterialCertificationClassification(element[8]);
                }

                list.add(certificationItem);

            }
            int count = 1;
            for (CertificationItem ci : list) {
                System.out.print(count + "\t");
                ci.certificationInfo();
                count++;
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return items;
    }
}
