import java.util.Arrays;

public class Ex5_3 {

	public static void main(String[] args) {
		//�迭�� Ȱ�� - <����> �迭�� ����� ������ �ݺ��ؼ� �ٲ�
		
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random() * 10);	//0~9���� �� ���� ���Ƿ� ����
			
			int tmp = numArr[0];	//numArr[0]��
			numArr[0] = numArr[n];	//numArr[n]�� ����
			numArr[n] = tmp;		//���� �ٲ۴�.
		}
		System.out.println(Arrays.toString(numArr));
		//�ߺ��� ���� ���� �� ����.
		//�ܼ��� �ڸ��� �ٲپ��� ����.
		
		
		
	}

}
