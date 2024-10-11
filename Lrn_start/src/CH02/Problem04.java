package CH02;

import java.util.Scanner;

public class Problem04{
	
	public static double CheckLength(double x1, double y1, double x2, double y2){
		double len = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));	//제곱근 : Math.sqrt, n제곱 : Math.pow
		return len;
	}

	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력 >> ");
		double cen_x = sc.nextDouble();
		double cen_y = sc.nextDouble();
		double r = sc.nextDouble();
		
		System.out.print("점 입력 >> ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		double length = CheckLength(cen_x,cen_y,x,y);
		
		if(length<r) {
			System.out.printf("점 (%.1f, %.1f)는 원 안에 있다.",x,y);
		}
		else 
			System.out.printf("점 (%.1f,%.1f)는 원 안에 있다.",x,y);
		
		sc.close();
					
	}
	
	
}