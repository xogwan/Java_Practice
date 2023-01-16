package ch05;

public class Ex05_8_9 { // 배열의 활용(1) - 총합과 평균 / 배열의 활용(2) - 최대값과 최소값
	public static void main(String[] args) {
//		int sum = 0;
//		float average= 0f;
//		
//		int[] score = {100, 88, 100, 100, 90};
//		
//		for (int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
//		average = sum / (float)score.length;
//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + average);
		
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];
		int min = score[0];
		
		for (int i = 0; i< score.length; i++) {
			if(score[i]>max){
				max = score[i];
			}else if(score[i]<min){
				min = score[i];
			}
			
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
