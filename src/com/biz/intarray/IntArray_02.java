package com.biz.intarray;

public class IntArray_02 {

	public static void main(String[] args) {
		
		// 학생개별 점수를 변수에 일단 저장하는 부분
		// 학생개별 점수는 어떤 규칙을 부여할 수 없으므로
		// 어쩔수 없이 작성해야 하는 코드
		// 이 부분의 코드는 간단하게 작성하기 어렵다.
		int intKor_01 = 90;
		int intKor_02 = 70;
		int intKor_03 = 80;
		int intKor_04 = 77;
		int intKor_05 = 90;
		int intKor_06 = 78;
		int intKor_07 = 60;
		
		/*
		 * 총점을 계산하는 부분은
		 * 거의 코드가 유사한데
		 * 끝에 숫자 2자리만 연속적으로 1씩 증가되고 있는 것을 볼 수 있다.
		 * 그렇다면 앞에 학습한 for 명령을 이용해서 작성할 수 있을것 같다.
		 */
		int intSum = 0;
		// for (int i = 1 ; i < 30 ; i++) {
		//	intSum += intKor_i;
		//}
		
		String a = "03";
		int intNum_03 = 0;
		/*
		 * 우리가 생각할 때
		 * 아래코드는 intNum_03 = 100 이라고 번역될 것으로
		 * 보이지만 컴퓨터는 인식하지 못하는 문법이다
		 */
		//intNum_a = 100;
		/*
		 * 아래코드도 intNum + a 는 intNum_03 이라고 변역될 것으로
		 * 보이지만 컴퓨터는 인식하지 못하는 문법이다
		 */
		//intNum + a = 100;		
		
		intSum += intKor_01;
		intSum += intKor_02;
		intSum += intKor_03;
		intSum += intKor_04;
		intSum += intKor_05;
		intSum += intKor_06;
		intSum += intKor_07;
		System.out.println("국어점수 총점 : " + intSum);
		
		float fAvg = 0;
		fAvg = intSum / 7.0f;
		
		System.out.println("국어점수 학급평균 : " + fAvg);
		
	}

}
