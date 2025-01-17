package ch04;

import java.util.Scanner;

public class Problem {
	
	public static void Pro02() {
		int sum = 0;
		for(int i=1;i<=100;i++) {
			if(i%3==0) sum+=i; 
		}
		System.out.println(sum);
	}
	public static void Pro03() {
		do{
			int num1=(int)(Math.random()*6)+1;
			int num2=(int)(Math.random()*6)+1;
			if (num1+num2==5) {
				System.out.printf("(%d, %d)\n",num1,num2);
				break;
			}
			System.out.printf("(%d, %d)\n",num1,num2);
		}while(true);
	}
	public static void Pro04() {
		for(int x=1;x<=10;x++) {
			for(int y=1;y<=10;y++) {
				int result = 4*x+5*y;
				if(result==60)
					System.out.printf("(%d, %d)\n",x,y);
			}
		}
	}
	public static void Pro05() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void Pro06() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<4-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i+1;k++) {
				System.out.print(("*"));
			}
			System.out.println();
		}
	}
	public static void Pro07() {
		boolean run=true;
		int balance=0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("-------------------------------");
			System.out.println("선택> ");
			
			String num = sc.nextLine();
			switch(num) {
				case "1":
					System.out.println("예금액>");
					balance += Integer.parseInt(sc.nextLine());
					break;
				case "2":
					System.out.println("출금액>");
					balance -= Integer.parseInt(sc.nextLine());;
					break;
				case "3":
					System.out.println("잔고>"+balance);
					break;
				case "4":
					run = false;
					break;
			}
		}
	System.out.println("프로그램 종료`");
	}
	
	
	
	public static void main(String[] args) {
		Pro07();
	}
}