package main;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		정수형
		byte b = 10;
		int i = b; //b변수의 값을 i변수에 복사
		System.out.println(i);
		
//		실수형
		float f = 10.0f;
		double d = f; //f변수의 값을 d변수에 복사
		System.out.println(d);// 10.0
		
//		정수형과 실수형
		int iNum = 1;
		float fNum = iNum; //더 정밀한 쪽으로 변환
		System.out.println(iNum); //1.0
		
//		연산중에 자동변환 되는 경우
		System.out.println(iNum+fNum);
	}

}
