package CH02;

//조건문

import java.util.Scanner;

public class Ex05{
	
	//예제 2-10 : 시험점수가 80점 이상이라면 합격 판별을 하는 프로그램
	public static void SuccessOrFail() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하시오 : ");
		int score = scanner.nextInt();
		
		if (score>=80) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		scanner.close();
	}
	
	//예제 2-11
	public static void MultipleOfThree() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int x = scanner.nextInt();
		
		if (x%3==0) {
			System.out.println(x+"는(은) 3의 배수입니다.");
		}
		else {
			System.out.println(x+"는(은) 3의 배수가 아닙니다.");
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		
		//SuccessOrFail();
		MultipleOfThree();
	}
}