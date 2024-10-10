package CH02;

import java.util.Scanner;

public class Problem03{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pose_x1 = 100;
		int pose_y1 = 100;
		int pose_x2 = 200;
		int pose_y2 = 200;
		
		System.out.print("점 (x,y)의 좌표를 입력하시오 >> ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x>pose_x1&&x<pose_x2) {
			if (y>pose_y1&&y<pose_y2) {
				System.out.println("("+x+","+y+")"+"는 사각형 안에 있습니다.");
			}
			else System.out.println("("+x+","+y+")"+"는 사각형 안에 없습니다.");
		}
		else System.out.println("("+x+","+y+")"+"는 사각형 안에 없습니다.");
		sc.close();
	}
}