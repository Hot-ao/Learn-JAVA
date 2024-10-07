package CH02;

//연산자

import java.util.Scanner;

public class Ex04{
	
	//초단위의 정수를 입력받고, 몇시간, 몇 분, 몇 초인지를 출력하는 프로그램 작성
	public static void ArithmeticOperator() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		int time = scanner.nextInt();
		int hour = (time/60)/60;
		int minute = (time/60)%60;
		int second = time%60;
		
		System.out.println(hour+"시 " + minute+"분 " + second+"초");
		scanner.close();
	}
	
	
	public static void main(String[] args) {
		ArithmeticOperator();
		
		/*
		 * 증감 연산 
		 	* prefix(접두사) : ++a or --a
		 		* 전위연산자 - 증가(감소)하고, 증가(감소)된 값 반환
		 		* a=1 일 때, b=++a 이면 b=2,a=2
		 	* postfix(접미사) : a++ or a-- 
		 		* 후위연산자 - 증가(감소) 하고, 증가(감소) 전의 값 반환
		 		* a=1 일 때, b=a++ 이면 b=1,a=2
		 *조건 연산 - 삼항 연산자(?)
		 	* condition ? opr2 : opr3
		 	* condition 이 true 이면 opr2, false 면 opr3
		
		 */
	}
}