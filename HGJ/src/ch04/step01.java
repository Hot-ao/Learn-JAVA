package ch04;

public class step01 {

	public static void main(String[] args) {
		int num = (int) (Math.random()*100%6+1);
		int num_ran = (int)(Math.random()*6) + 1;
		//Math.random() : 0.0~1.0 중 더블 타입의 난수 하나 리턴
		//(int) (Math.random()*n) + start
		//위 식에서 수는 start ~ start+1 사이의 정수가 된다.
		System.out.printf("%d번이 나왔습니다.",num_ran);
	}

}
