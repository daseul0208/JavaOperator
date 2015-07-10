package condition;

import java.util.Scanner;
/*
 * @ Date : 2015.07.10
 * @ Author : me
 * @ Story : if-else 예제(큰 수 구하기)
 */
public class BigNumber {
	public static void main(String[] args) {
		/*
		 문제) 학생 3명의 점수를 입력받아서 1등 출력(0점 ~ 100점)
		 결과) 1등은 98점입니다
		 힌트) a와b 비교, b와 c를 비교, a와 c를 비교
		 */
		int a = 0, b = 0, c = 0, top = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생1의 점수를 입력하세요");
		a = scanner.nextInt();
		System.out.println("학생2의 점수를 입력하세요");
		b = scanner.nextInt();
		System.out.println("학생3의 점수를 입력하세요");
		c = scanner.nextInt();
		/*
		 조건식을 따져서 결과를 가정하지 말고, 결과를 상정한 다음 거기에 맞는 조건식을 
		 설정하세요
		 */
		if (a > b && a > c) {
			top = a;
		} else if(b > a && b > c){
			top = b;
		} else if(c > a && c > b){
			top = c;
		} else{
			System.out.println("동점자가 존재합니다");
		}
		System.out.println("1등은 "+top+"점입니다");
	}
}










