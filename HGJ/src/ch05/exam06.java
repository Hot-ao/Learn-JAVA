package ch05;

import java.util.Scanner;

public class exam06 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo==1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			}
			else if(selectNo==2) {
				for(int i=0;i<studentNum;i++) {
					System.out.printf("scores[%d]> ",i);
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			}
			else if(selectNo==3) {
				for(int i=0;i<studentNum;i++) {
					System.out.printf("scores[%d]> %d\n",i,scores[i]);
				}
			}
			else if(selectNo==4) {
				int sum=0;
				for(int i=0;i<studentNum;i++) {
					sum+=scores[i];
				}
				System.out.println("최고 점수: "+sum);
				System.out.println("평균 점수: "+(double)sum/studentNum);
			}
			else if(selectNo==5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
