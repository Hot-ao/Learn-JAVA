package Sprout;


import java.util.Scanner;
	public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int table[][] = new int [9][9];
		int row=0;
		int col=0;
		int max=0;
		
		for (int i=0;i<table.length;i++) {
			for (int j=0;j<table[i].length;j++) {
				table[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0;i<table.length;i++) {
			for (int j=0;j<table[i].length;j++) {
				if(table[i][j]>=max) {
					max = table[i][j];
					row = i+1;
					col = j+1;
				}
			}
		}
		System.out.println(max);
		System.out.println(row+" "+col);
	}
}