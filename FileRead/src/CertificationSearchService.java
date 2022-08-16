import javax.swing.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class CertificationSearchService {
//    1인증번호(12302965) 2인증농가(김정채) 3인증품목명(흑벼)
public static void search() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("검색할 번호를 입력하시오.");
    System.out.println("1인증번호/2인증농가/3인증품목명");
    int input = scanner.nextInt();

    switch (input) {
        case 1:
            System.out.println("인증번호를 입력해 주세요.");
            String code = scanner.next();
            CertificationItem.certification();
            Stream<CertificationItem> codeStream = CertificationItemReader.list.stream();
            codeStream.filter(i -> i.getCertificationNo().equals(code)).forEach(CertificationItem::certificationInfo);
            Stream<CertificationItem> codeStream2 = CertificationItemReader.list.stream();
            if (codeStream2.noneMatch(i -> i.getCertificationNo().equals(code)))
                System.out.println("검색결과가 없습니다");
            break;
        case 2:
            System.out.println("인증농가를 입력해 주세요.");
            String name = scanner.next();
            CertificationItem.certification();
            Stream<CertificationItem> nameStream = CertificationItemReader.list.stream();
            nameStream.filter(i -> i.getCertificationFarm().equals(name)).forEach(CertificationItem::certificationInfo);
            Stream<CertificationItem> nameStream2 = CertificationItemReader.list.stream();
            if (nameStream2.noneMatch(i -> i.getCertificationFarm().equals(name)))
                System.out.println("검색결과가 없습니다");
            break;
        case 3:
            System.out.println("인증품목명을 입력해 주세요.");
            String item = scanner.next();
            CertificationItem.certification();
            Stream<CertificationItem> itemStream = CertificationItemReader.list.stream();
            itemStream.filter(i -> i.getCertificationItemName().equals(item)).forEach(CertificationItem::certificationInfo);
            Stream<CertificationItem> itemStream2 = CertificationItemReader.list.stream();
            if (itemStream2.noneMatch(i -> i.getCertificationItemName().equals(item)))
                System.out.println("검색결과가 없습니다");
            break;
        default:
            search();
            break;
    }

}




}


