package CH02;

import java.util.Scanner;
public class Ex03{
	
//키 입력 받기
	
	//system.in : 입력된 키를 단순한 바이트 정보로만 제공함 따라서 바이트 정보를 다시 변환해야함.
	/*
	 * Scanner 클래스 사용 - 위 단점 해결
	 	* 토큰 단위로 읽어옴(빈칸 기준으로 나눠서)
	 		* "Kim Seoul 20 65.1" => "Kim", "Seoul", "20", "65.1" 
	 	*next() : 공백이 낀 문자열 읽을 수 없음 & 문자열 입력 전까지 엔터 키 무시
	 	*nextLine() : 공백이 낀 문자열 받을 수 있음 & 엔터 키 입력시 종료
	 	*scanner.close() : scanner 객체의 사용을 종료 - scanner 객체 종료 시 System.in도 함께 닫히므로 더 이상 System.in을 사용해 키 입력 못 받음
	*/
	
	//예제2-4
	public static void ScannerEx(){
		System.out.println("이름,도시,나이,체중,독신여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("이름은 " + name + ",");
		
		String city = scanner.next();
		System.out.print("도시는 " + city + ",");

		int age = scanner.nextInt();	//정수 읽기
		System.out.print("나이는 " + age + ",");
		
		double weight = scanner.nextDouble();	//실수 읽기
		System.out.print("체중은 " + weight + ",");
		
		boolean isSingle = scanner.nextBoolean();	//논리값 읽기
		System.out.print("독신 여부는 " + isSingle + ",");
		scanner.close();
	}
	
	
	public static void main(String[] args) {
	
		ScannerEx();
		
	}
	
}