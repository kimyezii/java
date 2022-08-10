import javax.swing.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class CertificationSearchService {
//    1인증번호(12302965) 2인증농가(김정채) 3인증품목명(흑벼)
public static void search() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("1인증번호 2인증농가 3인증품목명");
    int input = scanner.nextInt();

    switch (input) {
        case 1:
            System.out.println("case 1");
            break;
        case 2:
            System.out.println("case 2");
            break;
        case 3:
            System.out.println("case 3");
            break;
        default:
            search();
            break;
    }

}




}


