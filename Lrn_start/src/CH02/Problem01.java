package CH02;

import java.util.Scanner;

 public class Problem01 {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("정수 3개 입력 >> ");
		 
		 int x = scanner.nextInt();
		 int y = scanner.nextInt();
		 int z = scanner.nextInt();
		 
		 System.out.println((x>y)?((x>z)?x:z):(y>z)?y:z);	//(((x>y)?x:y)>z):(x>y)?x:y):z
		 
	 }
 }