package main;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char형은 한글자 문자 저장 가능
		char ch1 = 'A'; //문자를 작은따음표로 감싸야함
		System.out.println(ch1); //A
		
//		문자를 int형으로 변환하면 그 문자에 해당되는 아스키값이 나옴
		System.out.println((int)ch1); //65
		
		char ch2 = 66; //char형 변수는 숫자도 저장 가능
		System.out.println(ch2); //문자가 출력됨.
		
		char ch3 = '\n'; //한줄띄기를 의미하는 특수문자
		char ch4 = '\t'; //탭을 의미하는 특수문자
		
		System.out.print(ch3);
		System.out.print("안녕하세요 \n");
		System.out.print(ch4);
		System.out.print("\t저는 둘리입니다.");
		
//		String형은 문자열 저장 가능
		String str = "안녕하세요"; //텍스트를 큰따음표로 감싸야함
		System.out.println(s tr);                                 
	}

}
