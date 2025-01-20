package ch05;

public class Problem {
	
	public static void Pro04(){
		int max=0;
		int[] array = {1,5,3,8,2};
		
		for(int i:array) {
			max=(max>i)?max:i;
		}
		
		System.out.println("max : "+max);
	}
	public static void Pro05() {
		int[][] array = {
			{95,86},
			{83,92,96},
			{78,83,93,87,88}
		};
		int sum=0;
		double avg=0.0;
		
		int count=0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sum+=array[i][j];
			}
			count +=array[i].length;
		}
		avg = (double)sum/count;
		
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
	}
	public static void main(String[] args) {
		Pro05();
	}

}
