package �迭����;
/*
 * int a = 10;  => 4����Ʈ ũ�⿡ 10�̶�� �������� �����ϴ� a��� ������ ���� �� �ʱ�ȭ
 * ���������� ���� ���α׷��� �����Ͽ� ��������!!
 */
public class ArrayEx01 {

	public static void main(String[] args) {
//			  '�迭��'
//		int[] scores = {85, 90, 70, 80};  //'1���� �迭'�� �ʱ�ȭ /[]���ȣ 1��
		int[] scores = {85, 90, 70, 80, 100};
//		�ڷ��� �ڿ� []��ġ		'�迭�� �ʱⰪ'	/* �迭�� 'index'�� 0���� ����.
//		�̸� ����� �ϰ� ¥�� �ڵ��� �ڵ����� �̶�� ��(ex.[]�� ��ġ�� ��� �� ������)
		System.out.println("JAVA ����: " + scores[0]);
		System.out.println("html ����: " + scores[1]);
		System.out.println("JavaScript ����: " + scores[2]);
		System.out.println("�����ͺ��̽� ����: " + scores[3]);
		
//		[����] 4������ ������ ��հ��� ���Ͻÿ�.
//		����� �ݺ��� �߿��� for�� ����
		int totalSum = 0;  //���� ������ �ʱⰪ 0���� ����!! /������ int
		/*
		for(int i=0; i<4; i++) {
			totalSum = totalSum + scores[i];
		}
		*/
		for(int i=0; i<scores.length; i++) {  //length�� �迭 ��ü�� �ʵ��� �Ѵ�.
			totalSum = totalSum + scores[i];
		}
		System.out.println("����: " + totalSum);
		
//		double avg = (double)totalSum / 4;  //�Ǽ��� double
		double avg = (double)totalSum / scores.length;
		/*
		 * [����] ������ ������ ���� ����� �������� ����!!
		 * 325 /4 = 81 => 81.0 => ĳ��Ʈ������ �̿��Ͽ� 81.25�� ������ �ϸ� �ȴ�.
		 * ������ ������ �Ǽ��� ������ ��ȯ�ϱ����� (dataType)��� ĳ��Ʈ�����ڸ� ���� ��������ȯ
		 */
		System.out.println("���: " + avg);
	}

}
