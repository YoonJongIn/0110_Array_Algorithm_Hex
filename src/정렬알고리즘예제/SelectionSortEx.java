package ���ľ˰�����;
/*
 * ���� ����(Selection sort) �˰��� ���� => ���� ���� ��Ű��
 */
public class SelectionSortEx {

	public static void main(String[] args) {
		int[] num = {30, 10, 20, 50, 40};  //�迭�� �ʱⰪ�� {}
		int temp;   //�ӽ� ���� ����
		int n = 5;  //�迭�� ������ ����
		
//		���� ���� �˰��� ����
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;  //������ ã�Ⱑ ��ƴ�.
				}
			}
		}
		System.out.println("<<< ���ĵ� ������ ��� >>>");
		for(int k=0; k<n; k++) {
			System.out.print(num[k] + " ");
		}
	}
}
