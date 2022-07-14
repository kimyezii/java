package study_0714;

public class Ex6 {
//싱글 쓰레드와 멀티 쓰레드, 쓰레드의 I/O 블락킹
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		for(int i=0; i < 300; i++)
			System.out.printf("%s", new String("-"));		

		System.out.print("소요시간1:" +(System.currentTimeMillis()- startTime)); 

		for(int i=0; i < 300; i++) 
			System.out.printf("%s", new String("|"));		

 		System.out.print("소요시간2:"+(System.currentTimeMillis() - startTime));

	}

}
