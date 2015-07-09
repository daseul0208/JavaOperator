package controller;

import ifCondition.ArithmeticCalc;
import ifCondition.CalAvg;

public class OperatorController {
	public static void main(String[] args) {
		// 2015.07.09 성적계산기
		CalAvg avg = new CalAvg();
	//	avg.calcAvg();
		// 2015.07.09 사칙연산 계산기
		ArithmeticCalc calc = new ArithmeticCalc();
		calc.calc();
	
	}
}

	