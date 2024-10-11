package CH02;

import java.util.Scanner;

public class Problem05{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연산 >> ");
		double a = sc.nextDouble();
		String operator = sc.next();
		double b = sc.nextDouble();
		double result = 0;

		if(b==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.exit(0);
		}
		switch(operator){
			case "+":
				result = a+b;
				break;
			case "-":
				result = a-b;
				break;
			case "*":
				result = a*b;
				break;
			case "/":
				result = a/b;
			default:
				System.out.println("잘못된 연산자입니다.");
				sc.close();
			}
		System.out.printf("%.1f %s %.1f의 계산 결과는 %.1f",a,operator,b,result);
		
		sc.close();
		
	}
}