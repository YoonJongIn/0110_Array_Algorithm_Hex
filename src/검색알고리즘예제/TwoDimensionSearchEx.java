package �˻��˰�����;

import java.util.Scanner;

public class TwoDimensionSearchEx {

	public static void main(String[] args) {
		String[][] str = {{"1","����ö","����"},
				          {"2","�迬��","����"},
				          {"3","����ȣ","����"},
				          {"4","����ȣ","����"}};
		int i;
		String find;
		
		System.out.print("ã���� �ϴ� �̸���? ");
		Scanner scan = new Scanner(System.in);
		find = scan.next();
		
		for (i = 0; i < str.length; i++) {
			if (find.equals(str[i][1])) {
				System.out.println("�˻����: "+str[i][0]+" "+str[i][1]+" "+str[i][2]);
				break;
			}
		}
		if (i == str.length) {
			System.out.println(find + "��(��) ã�� �� �����ϴ�.");
		}
		scan.close();		
	}
}
