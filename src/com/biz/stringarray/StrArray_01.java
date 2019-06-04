package com.biz.stringarray;

public class StrArray_01 {
	
	public static void main(String[] args) {
		
		// 숫자형 배열은 선언과 초기화를 하면 모든 요소의 값이 0으로
		// 생성된다
		int[] intKor = new int[5];
				
		// 문자열형 배열은 선언과 초기화를 하면
		// 모든요소의 값이 "" 으로 생성된다.
		String[] strName = new String[5];
		strName[0] = "" ;
		
		// 아래에서 [0].[1],[2]... 배열의 첨자라고 부른다
		// strName 배열의 위치 주소값이다.
		strName[0] = "홍길동";
		strName[1] = "이몽룡";
		strName[2] = "성춘향";
		strName[3] = "장보고";
		strName[4] = "임꺽정";
		
	}
	
}
