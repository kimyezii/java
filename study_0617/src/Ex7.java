import java.util.Arrays;

public class Ex7 {

	public static void main(String[] args) {
		//ch5-16,17 커맨드라인입력받기
		//Run -> Configurations -> (x)= Arguments
		
		System.out.println("매개변수의 개수:"+args.length);
		for(int i=0;i< args.length;i++) {
			System.out.println("args[" + i + "] = \""+ args[i] + "\"");
		}
	}

}
