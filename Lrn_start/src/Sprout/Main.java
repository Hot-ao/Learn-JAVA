package Sprout;


import java.util.Scanner;
	public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double temp;
			if (a==0&&b==0&&c==0) break;
			if (a<b) {
				temp=b;
				b=a;
				a=temp;
			}
			if (a<c) {
				temp=a;
				a=c;
				c=temp;
			}
			if (b<c) {
				temp=b;
				b=c;
				c=temp;
			}
			if(a*a==(b*b+c*c)) System.out.println("right");
			
			else System.out.println("wrong");
		}
	}
}