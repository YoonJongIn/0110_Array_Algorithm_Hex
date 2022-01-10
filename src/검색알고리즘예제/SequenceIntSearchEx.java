package 검색알고리즘예제;

import java.util.Scanner;

/*
 * 순차 검색(Sequential search) 알고리즘
 */
public class SequenceIntSearchEx {

	public static void main(String[] args) {
		//준비 단계
		int[] data = {30,10,50,40,20,70,90,25};  //데이터 크기가 랜덤이여도 검색 가능
		//             0  1  2  3  4  5  6  7(index값)
		int i;
		int n = 8;  //데이터 개수
		
		//입력 단계
		System.out.print("찾고자 하는 값은? ");
		Scanner scan = new Scanner(System.in);
		int find = scan.nextInt();  //정수로 바꿔줘야함
		
		//순차 검색 알고리즘 적용
		for (i = 0; i < n; i++) {  //i가 8이되면 빠져나와서
			if (find == data[i]) {
				System.out.println("찾고자 하는 값은 " + data[i] + "입니다.");
				break;
			}
		}
		if (i == n) {  //여기에 8이 대입된다.
			System.out.println(find + "을(를) 찾을 수 없습니다.");
		}
		scan.close();
	}
}
