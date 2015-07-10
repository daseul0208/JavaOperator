package condition;

public class OnlyIf {
	public static void main(String[] args) {
		int x= 1, y = 2; // 지변 초기화
		if ((x==1) && (y==1)) { // && 엔퍼센트라 읽고 and 연산자
			System.out.println("x는 1이면서, y도 2이다.");
		}
		if ((x==1)||(y==1)) { // || 컬럼이라 읽고 or 연산자
			System.out.println("x는 1이거나, y는 2이다.");
		}
	}
}
