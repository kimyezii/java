import java.util.Arrays;

public class Ex5_1 {

	public static void main(String[] args) {
		//�迭�� Ȱ�� - <���հ� ���>
		int sum = 0;		//������ �����ϱ� ���� ����
		float average = 0f; //����� �����ϱ� ���� ����
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i=0; i < score.length; i++) {
			sum += score[i];
		}
		average = sum / (float)score.length;	//������� floatŸ������ ��ȯ
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);
		
		
		//int 478 / int 5 = 95
		//478 / float 5 -> 478 / float 5.0f -> float 478.0f / float 5.0f -> 95.6f
	}

}
