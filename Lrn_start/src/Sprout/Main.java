package Sprout;


import java.util.Scanner;
	public class Main{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int X = sc.nextInt();
	int IntArray[] = new int [N];
	for (int i=0;i<N;i++) {
		IntArray[i] = sc.nextInt();
	}
	for (int i=0;i<N;i++) {
		if(IntArray[i]<X) System.out.println(IntArray[i]+" ");
	}
	}	
}