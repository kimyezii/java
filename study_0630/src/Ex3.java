
//  ���ܹ߻���Ű��
public class Ex3 {

	public static void main(String[] args) {
//		throw new RuntimeException();		//Exception�� ���Ƿ� �߻���Ų��.
		try {	//Exception�� �� �ڼ��� �ݵ�� ����ó���� ����� �Ѵ�.(�ʼ�)
			throw new RuntimeException();		
			
		} catch(Exception e) {
			
		}
		
		throw new RuntimeException();	//RuntimeException�� �� �ڼ��� ����ó���� ������ �ʾƵ� �������� �ȴ�.(����)
	}

}