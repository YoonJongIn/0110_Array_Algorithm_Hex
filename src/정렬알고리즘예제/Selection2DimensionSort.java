package ���ľ˰�����;

public class Selection2DimensionSort {

	public static void main(String[] args) {
		String[][] str = {{"1","����ȣ","����","���α׷���"},
						  {"2","�輱��","��õ","ȸ���"},
						  {"3","����ö","�д�","������"},
						  {"4","������","����","��ȣ��"}};
		String temp;
		
		//"�̸�"������ ��������!!
		for (int i = 0; i < str.length-1; i++) {
			for (int j = i+1; j < str.length; j++) {
				if (str[i][1].compareTo(str[j][1]) > 0) {
					for (int k = 0; k < str[0].length; k++) {  //if�� �ؿ� �ݺ���(for)�� �ѹ� �� ���´�.
						temp = str[i][k];
						str[i][k] = str[j][k];
						str[j][k] = temp;
					}
				}
			}
		}
		//���
		for (int m = 0; m < str.length; m++) {
			for (int s = 0; s < str[0].length; s++) {
				System.out.print(str[m][s] + " ");
			}
			System.out.println();
		}
	}
}
