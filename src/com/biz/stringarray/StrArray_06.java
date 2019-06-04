package com.biz.stringarray;

public class StrArray_06 {
	public static void main(String[] args) {
		
		String strName = "홍길동 이몽룡 성춘향 임꺽정";
		
		// 빈칸 " " 을 기준으로 strName을 분해해서 배열로 생성
		String[] strNames = strName.split(" ");
		for(int i = 0 ; i < strNames.length ; i++) {
			System.out.println( i + "번째 :" + strNames[i]);
		}
	}
}
