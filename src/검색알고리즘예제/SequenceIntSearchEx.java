package �˻��˰�����;

import java.util.Scanner;

/*
 * ���� �˻�(Sequential search) �˰���
 */
public class SequenceIntSearchEx {

	public static void main(String[] args) {
		//�غ� �ܰ�
		int[] data = {30,10,50,40,20,70,90,25};  //������ ũ�Ⱑ �����̿��� �˻� ����
		//             0  1  2  3  4  5  6  7(index��)
		int i;
		int n = 8;  //������ ����
		
		//�Է� �ܰ�
		System.out.print("ã���� �ϴ� ����? ");
		Scanner scan = new Scanner(System.in);
		int find = scan.nextInt();  //������ �ٲ������
		
		//���� �˻� �˰��� ����
		for (i = 0; i < n; i++) {  //i�� 8�̵Ǹ� �������ͼ�
			if (find == data[i]) {
				System.out.println("ã���� �ϴ� ���� " + data[i] + "�Դϴ�.");
				break;
			}
		}
		if (i == n) {  //���⿡ 8�� ���Եȴ�.
			System.out.println(find + "��(��) ã�� �� �����ϴ�.");
		}
		scan.close();
	}
}
