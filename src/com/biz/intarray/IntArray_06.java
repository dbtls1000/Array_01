package com.biz.intarray;

public class IntArray_06 {

	public static void main(String[] args) {
		
		// 배열을 선언하고 초기화까지 모두 동시에 수행
		// 각배열의 내용은 int형일 경우 모두 0으로 clear
		int[] intKor = new int[30];
		int intEng[] = new int[30];
		
		// 배열을 선언만하기
		int[] intMath;
		
		/*
		 * 일반적인 변수는 선언한 후
		 * 읽기는 안되지만 쓰기는 된다.
		 * 하지만 배열은 선언 후 초기화 하지 않으면
		 * 읽기 쓰기 아무것도 할 수 없다.
		 */
		// intMath[0] = 90;
		
		// 선언후 따로 초기화하기
		intMath = new int[30];
		
		// 빼열은 선언후 초기화 하지 않으면 읽기가 안된다.
		System.out.println(intMath[0]);
	
	}

}
