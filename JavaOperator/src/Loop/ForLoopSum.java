package Loop;
/*
 * @ Date : 2015.07.10
 * @ Author : me
 * @ Story : for-loop을 활용한 1부터 10까지 함
 */
public class ForLoopSum {
	public static void main(String[] args) {
		// 현재 지변을 초기화 하지 않는 이유는 for-loop 내부에서 하고 있기 떄문
		int sum = 0;
		// 누적되는 결과값을 출력하는 변수는 for-loop 바깥쪽에 선언 및 초기화한다
		for (int i = 1; i < 11; i++) {
			sum += i; 
		// i값이 회전하면서 증가하는 값을 누적시키는 연산
		}
		System.out.println("1부터 10까지 합:"+sum);
	}
}
