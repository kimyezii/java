package study_0706;

public class Ex9_4 {

	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));

	}

	public static boolean contains(String src, String target) {
		return src.indexOf(target) != -1;
		//indexOf()는 지정된 문자열(src)에서 특정 문자열(target)을 찾아서 그 위치를 알려준다.
		//만일 찾지 못한다면 -1을 반환하므로 indexOf()의 결과가 -1인지만 확인해서 그 결과를 돌려주면 된다.
	}

}
