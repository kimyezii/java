package study_0721;

import java.util.Optional;

//Optional
public class Ex1 {

	public static void main(String[] args) {
//		int[] arr = null;	// null로 초기화 X
		int[] arr = new int[0];
		System.out.println("arr.length="+arr.length);
		
//		Optional<String> opt = null; //ok. 하지만 바람직하지 않음
		Optional<String> opt = Optional.empty();
//		Optional<String> opt = Optional.of("abc");
		System.out.println("opt="+opt);
//		System.out.println("opt="+opt.get());
		
		
		
		String str = "";
		
//		try {
//			str = opt.get();
//		} catch (Exception e) {
//			str = "";	//예외가 발생하면 빈문자열("")로 초기화
//		}	//예외발생
		
		str = opt.orElse("");	//Optional에 저장된 값이 null이면 ""반환
//		str = opt.orElseGet(() -> new String());//람다식	
//		str = opt.orElseGet(String::new);	//메서드참조
		System.out.println("str="+str);

	}

}
