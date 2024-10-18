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
	
	public static void ScoreAverage() {
		double score[][] = {{3.3,3.4},
							{3.5,3.6},
							{3.7,4.0},
							{4.1,4.2}};
		double sum=0;
		for (int year=0;year<score.length;year++) {
			for (int term=0;term<score[year].length;term++) {
				sum+=score[year][term];
			}
		}
		System.out.println(sum/(score.length*score[0].length));
	}
	
	public static void skewedArray() {
		int IntArray[][] = {{10,11,12},{20,21},{30,31,32},{40,41}};
		for (int row=0;row<IntArray.length;row++) {
			for (int col=0;col<IntArray[row].length;col++) {
				System.out.print(IntArray[row][col]+" ");
			}
			System.out.println("");
		}
	}
	
	//배열 리턴 메소드
	public static int[] makeArray() {
		int temp[] = new int[4];
		for (int i=0;i<temp.length;i++) {
			temp[i] = i;
		}
		return temp;
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
		 * 다차원 배열
		 	* 배열 선언	자료형 래퍼런스변수[][] = new 자료형 [행][열];
		 	* 배열 초기화	자료형 래퍼런스변수[][] = {{0,1,2,3},{4,5,6,7}}; 2행 4열 배열 (2x4배열)
		 * 비정방형 배열
		 	* 각 행의 열의 개수가 서로 다른 배열
		 */
		//ArrayAccess();
		//ArrayMean();
		//ForEachEx();
		//ScoreAverage();
		
		//비정방형 배열
		int i[][];
		i = new int[4][];
		i[0] = new int [1];
		i[1] = new int [2];
		i[2] = new int [3];
		i[3] = new int [4];
		int intArray[][] = {{0},{1,2},{3,4,5},{6,7,8,9}};
		skewedArray();
		
		int Array[] = new int [4];
		Array = makeArray();
		for (int k=0;k<Array.length;k++) System.out.print(Array[k]+" ");
		

	}
}