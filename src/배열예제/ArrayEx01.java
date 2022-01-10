package 배열예제;
/*
 * int a = 10;  => 4바이트 크기에 10이라는 정수값을 저장하는 a라는 변수를 선언 및 초기화
 * 유지보수가 좋은 프로그램을 염두하여 개발하자!!
 */
public class ArrayEx01 {

	public static void main(String[] args) {
//			  '배열명'
//		int[] scores = {85, 90, 70, 80};  //'1차원 배열'의 초기화 /[]대괄호 1개
		int[] scores = {85, 90, 70, 80, 100};
//		자료형 뒤에 []위치		'배열의 초기값'	/* 배열의 'index'는 0부터 시작.
//		미리 약속을 하고 짜는 코딩을 코드패턴 이라고 함(ex.[]의 위치를 어디에 둘 것인지)
		System.out.println("JAVA 점수: " + scores[0]);
		System.out.println("html 점수: " + scores[1]);
		System.out.println("JavaScript 점수: " + scores[2]);
		System.out.println("데이터베이스 점수: " + scores[3]);
		
//		[문제] 4과목의 총점과 평균값을 구하시오.
//		제어문의 반복문 중에서 for문 적용
		int totalSum = 0;  //누적 변수는 초기값 0으로 주자!! /정수는 int
		/*
		for(int i=0; i<4; i++) {
			totalSum = totalSum + scores[i];
		}
		*/
		for(int i=0; i<scores.length; i++) {  //length는 배열 객체의 필드라고 한다.
			totalSum = totalSum + scores[i];
		}
		System.out.println("총점: " + totalSum);
		
//		double avg = (double)totalSum / 4;  //실수는 double
		double avg = (double)totalSum / scores.length;
		/*
		 * [주의] 정수와 정수의 연산 결과는 정수값이 나옴!!
		 * 325 /4 = 81 => 81.0 => 캐스트연산자 이용하여 81.25가 나오게 하면 된다.
		 * 정수의 값에서 실수의 값으로 변환하기위해 (dataType)라는 캐스트연산자를 통해 강제형변환
		 */
		System.out.println("평균: " + avg);
	}

}
