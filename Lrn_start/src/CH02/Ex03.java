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
	
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		scanner.close();
	}
	
}