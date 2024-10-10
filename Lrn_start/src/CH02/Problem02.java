package CH02;

import java.util.Scanner;

public class Problem02{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오 >> ");
		int num = scanner.nextInt();
		
		
		if (num>=10) {
			if ((int)(num/10)%3==0) {
				if (num%10%3==0) {
					System.out.println("박수짝짝");
				}
				else {
					System.out.println("박수짝");
				}
			
			}
		}
		else {
			if (num%3==0) {
				System.out.println("박수짝");
			}
			else {
				System.out.println(num);
			}
		}
			
	}
}