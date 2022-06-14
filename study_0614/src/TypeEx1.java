
public class TypeEx1 {

	public static void main(String[] args) {
		//타입간의 변환방법
		
		String string = "3";
		
		System.out.println('3' - '0'); //문자에서 숫자 (결과:숫자3)
		System.out.println('3' - '0' +1); //숫자 (결과:숫자4)
		System.out.println(Integer.parseInt("3") +1); //문자열을 숫자로(결과:4)
		System.out.println("3" + 1); //문자3+문자1 (결과:31) 
		System.out.println((char)(3 + '0')); //(0은 48) (결과:문자3)
		
	}

}
