
public class Ex1 {

	public static void main(String[] args) {
		//���� ������
		int i = 5, j = 0;
		
		j = i++; //������
		System.out.println("j=i++; ���� ��, i=" + i + ", j="+ j);
		
		i = 5;	//����� ���ϱ� ����, i�� j�� ���� 
		j = 0;	//�ٽ� 5�� 0���� ����
				
		j = ++i; //������
		System.out.println("j=++i; ���� ��, i=" + i +", j="+ j);
	}

}
