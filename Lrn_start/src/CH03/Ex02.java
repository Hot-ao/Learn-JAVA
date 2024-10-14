package CH03;

import java.util.Scanner;

public class Ex02{
	
	public static void ArrayAccess() {
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
	
	public static void ArrayMean() {
		Scanner sc = new Scanner(System.in);
		int IntArray[] = new int[5];
		double sum=0;
		for (int i =0;i<IntArray.length;i++) {
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println(sum/IntArray.length);
	}
	
	enum Week {월, 화, 수, 목, 금, 토, 일}
	public static void ForEachEx() {
		int [] n= {1,2,3,4,5};
		String names[] = {"사과","배","바나나","체리","딸기","포도"};
		int sum=0;
		for (int k:n) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("합은 "+sum);
		for (String s:names) System.out.print(s+" ");
		System.out.println();
		for (Week day:Week.values()) System.out.print(day+"요일 ");
		System.out.println();
		
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
		 	* 배열 크기 - Array.length
		 * 배열&반복문 : for - each 문
		  	for (int i=0;i<n.length;i++){int k=n[i]; sum+=k;}
		  	for (int k:n) sum+=k;
		  	같은 구문
		 */
		//ArrayAccess();
		//ArrayMean();
		ForEachEx();

	}
}