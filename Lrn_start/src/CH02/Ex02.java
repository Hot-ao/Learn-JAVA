package CH02;

public class Ex02{
	
	//예제 2-2
	//상수(final)	
	public static double CircleArea(){
		final double PI = 3.14;
		double radius = 10.0;
		return radius*radius*PI;
	}
	
	//예제 2-3
	public static void TypeConversion() {
		byte b = 127;
		int i =100;
		System.out.println(b+i);
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x12340041);
		System.out.println((byte)(b+i));
	}
	
	public static void main(String[] args) {
		//변수 동시 선언 & 초기화 가능
		char c1 = 'a', c2 = 'b', c3 = 'c';
		
		//변수 타입 생략 가능 (var)
		var price = 200;	//price는 int 타입으로 결정 됨
		
		/*
		 * 리터럴 : 프로그램에 직접 표현한 값(1, '%', "hello")
		 	* 정수 리터럴 int : 십진수(15), 8진수('0'15), 16진수('0x'15), 2진수('0b'0101) 
		 		*long 타입 지정(15'l' or  15'L')
		 	* 실수 리터럴 double : 0.12, 12E-2
		 		* 0.12f -> float 강제 변환
		 		* .12D -> double 강제 변환
		 	* 문자 리터럴 char : 'A', '글', '\u0041'(\\u + 유니코드)  
		 	* 논리 리터럴**
		 		*자바에서는 숫자를 참, 거짓으로 사용 불가능!!
		 */
		
		System.out.println("원의 면적 : " + CircleArea());
		
		/*
		 * 타입 변환
		 	* 자동 타입 변환 : 치환문 or 수식에서 타입이 일치하지 않을 때, 오류 발생 x 작은 타입을 큰 타입으로 자동 변환
		 		* long m = 25; => int보다 long이 더 큼
		 			따라서 오류 발생 x int 25를 long으로 자동 변환
		 	* 강제 타입 변환 int n = 30; /n byte b = n; --> byte 보다 int가 더 큼
		 		따라서 오류 발생 ==> byte b = (byte)n; 이처럼 강제 변환 시켜야 함		b : 44가 됨
		 		* 이때 변환된 만큼 데이터 손실이 발생함 byte(0~255 범위 즉 크기가 256) 300-256 = 44
		 		* 실수를 정수로 강제 변환하면 소수점 이하의 손실이 발생 double 1.9 => int 1
		 */
		
		TypeConversion();
	}
}