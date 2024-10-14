package CH03;

import java.util.Scanner;

public class Ex02{
	
	public static void ArrayAccess(){
		Scanner sc = new Scanner(System.in);
		int IntArray[] = new int [5];
		int max =0;
		for (int i=0;i<5;i++) {
			IntArray[i] = sc.nextInt();
			if (IntArray[i]>max) max = IntArray[i];
		}
		System.out.println(max);
		sc.close();
		
	}
//배열	
	public static void main(String[] args) {
		/*
		 * 배열
		 	* 배열 선언	자료형 레퍼런스변수[] = new 자료형 [원수 개수];
		 	 			int intArray[] <-- 레퍼런스변수 뒤 []에 배열의 크기를 지정할 수 업음
		 	* 배열 초기화 int intArray[] = {}; <-- 배열의 크기는 {} 안의 원소 개수에 따라 정해짐
		 	* 배열 공유
		 		* int intArray[] = new int[5];	int myArray[] = intArray; <-- myArray와 intArray가 서로 공유함
		 */
		ArrayAccess();
		

	}
}