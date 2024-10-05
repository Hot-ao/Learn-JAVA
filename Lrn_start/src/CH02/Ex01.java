package CH02;

public class Ex01{		//클래스 만들기
	
	//한 라인 주석		같은 행에 대해서 주석
	/*
	 * 여러 행에 대해서 주석
	 */
	
	//메소드 (= 함수)
	public static int sum(int n, int m) {	//n,m : 매개변수
		return n+m;
	}
	
	
	
	//main() 메소드	public, void, static 타입으로 선언 되어야 하며 한 클래스에는 최대 한 개의 클래스만 존재 가능, 없어도 됨
	//main() 메소드에서 실행 시작
	public static void main(String[] args) {
		int i = 20;		//변수 - 지역변수; 메소드 내에서만 사용, 매소드 종료시 소멸
		int s;
		char a;
		
		s =sum(i,10);
		a = '?';
		System.out.println(a);	//출력 : System.out.println - 다음행으로 이동, System.out.print - 다음행으로 이동 x
		System.out.println("Hello");
		System.out.println(s);
	}
	
}
