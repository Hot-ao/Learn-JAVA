package Sprout;


import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int total=1;
    	if (num == 0)
    		total = 1;
    	else
    		for (int i=1;i<num+1;i++) total*=i;
    	System.out.println(total);

    }	
}