package study_0721;

import java.util.Optional;

//Optional
public class Ex1 {

	public static void main(String[] args) {
//		int[] arr = null;	// null�� �ʱ�ȭ X
		int[] arr = new int[0];
		System.out.println("arr.length="+arr.length);
		
//		Optional<String> opt = null; //ok. ������ �ٶ������� ����
		Optional<String> opt = Optional.empty();
//		Optional<String> opt = Optional.of("abc");
		System.out.println("opt="+opt);
//		System.out.println("opt="+opt.get());
		
		
		
		String str = "";
		
//		try {
//			str = opt.get();
//		} catch (Exception e) {
//			str = "";	//���ܰ� �߻��ϸ� ���ڿ�("")�� �ʱ�ȭ
//		}	//���ܹ߻�
		
		str = opt.orElse("");	//Optional�� ����� ���� null�̸� ""��ȯ
//		str = opt.orElseGet(() -> new String());//���ٽ�	
//		str = opt.orElseGet(String::new);	//�޼�������
		System.out.println("str="+str);

	}

}
