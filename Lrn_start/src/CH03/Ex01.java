package CH03;

import java.util.Scanner;
//반복문
public class Ex01{
	
	//예제 3-1
	public static void LoopSum() {
		int sum=0;
		
		for (int i=1;i<=10;i++) {
			if (i==10) {
				sum+=i;
				System.out.print(i+"="+sum);
				break;
			}
			System.out.print(i+"+");
			sum+=i;
		}
	}
	//예제 3-2
	public static void LoopMean() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int n = 0;
		double sum=0;
		
		while (i != -1) {
			n++;
			sum += i;
			i = sc.nextInt();
		}
		System.out.print(n+" "+sum/n);
		sc.close();
	}
	//예제 3-3
	public static void LoopAlpha() {
		char c = 'a';
		do {
			System.out.print(c);
			c = (char)(c+1);
		} while (c <= 'z');
	}
	//예제 3-4
	public static void NestedLoop() {
		for (int i=1;i<10;i++) {
			for (int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
	//예제 3-5
	public static void SumPositive() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int num = 0;
		int sum = 0;
		while(i<5) {
			num = sc.nextInt();
			if(num>0) {
				sum+=num;
				i++;
			}
			else continue;
		}
		System.out.println(sum);
		sc.close();
	}	
	public static void main(String[] args) {
	
	/*
	 * for 문		for(초기문; 조건식; 반복 후 작업)
	 	* 조건식이 true 혹은 빈칸 이면 무한 반복 
	 	* 반복 후 작업에는 여러 문장 나열 가능 콤마(,)로 구분 ; i++, System.out.println(i)
	 * while 문		while(조건식)
	 	* 조건식이 빈칸이면 안 됨. 
	 * do while 문	do {	} while(조건식);
	 	* 작업문이 최초 1회 실행
	 */
	//LoopSum();
	//LoopMean();
	//LoopAlpha();
	//NestedLoop();	
	SumPositive();
	}
}