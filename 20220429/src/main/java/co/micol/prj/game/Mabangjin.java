package co.micol.prj.game;

import java.util.Scanner;

public class Mabangjin {
	private Scanner sc = new Scanner(System.in);
	
	public void run() {
		System.out.println("마방진게임");
		System.out.println("홀수만 입력하세요.");
		int size = sc.nextInt();
		
		
		int[][] arr = new int [size][size]; //배열 생성
		int num = 1;
		System.out.println(size + " * " + size + "마방진");
		for(int i = 0, j = size / 2; num <= size * size;num++) {
			arr[i][j] = num;
			if(num % size == 0) { //넘버 사이즈가 0과 같으면 1을증가
				i++;
			}else {
				i--;
				j++;
				if(i < 0) i = size -1;
				if(j > size -1) j = 0;
			}
		}
		//출력호출
	toprint(arr);	
	}
	
	private void toprint(int[][] result) {
		for(int[] num : result) {
			for(int n : num) {
				System.out.printf("%3d",n);
			}
			System.out.println();
		}
		
		
	}
}
