package controller;

import Loop.EvenoddSum;
import condition.ArithmeticCalc;
import condition.CalAvg;
import condition.ManOrWoman;
import condition.SwitchAvg;

public class OperatorController {
	public static void main(String[] args) {
		// 2015.07.09 성적계산기
		CalAvg avg = new CalAvg();
	//	avg.calcAvg();
		// 2015.07.09 사칙연산 계산기
		ArithmeticCalc calc = new ArithmeticCalc();
	//	calc.calc();
		// 2015.07.10 스위치 성적 계산기
		SwitchAvg avg2 = new SwitchAvg();
	//	avg2.calc();
		ManOrWoman manOrWoman = new ManOrWoman();
	//	manOrWoman.ssn(); // ssn() 원 클래스의 메소드 이름이다
		
		EvenoddSum evenoddSum = new EvenoddSum();
		evenoddSum.calc(); // 객체가 메소드를 호출한다
		
	}
}

	