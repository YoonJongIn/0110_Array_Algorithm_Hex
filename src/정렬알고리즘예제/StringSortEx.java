package ���ľ˰�����;

public class StringSortEx {

	public static void main(String[] args) {
		//�غ� �ܰ� => ���� ����, �迭�� ���� => �׸�(�������)�� �غ� �� �ʱ�ȭ
		String[] name = {"����ȣ","�輱��","����ö","������"};
		String temp;  //���ڿ��� �ּҸ� ���� �׸�
		int n = 4;
		
		//ó�� �ܰ� => �������� �˰��� ����
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if(name[i].compareTo(name[j]) > 0) {  //��������(>) ��������(<)
					temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
			}
		}
		//��� �ܰ�
		System.out.println("<<< ���ĵ� ���ڿ� >>>");
		
		for (int k = 0; k < n; k++) {
			System.out.print(name[k] + " ");
		}
	}
}
