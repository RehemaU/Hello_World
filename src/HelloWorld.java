
public class HelloWorld {
	public static void main(String[] orgs) {
		System.out.println("Hello World\n");
		System.out.println("\t\\Hello World/\n\n");
		System.out.println("\"Hello World!\"");
		
		System.out.printf("%d + %d = %d", 10,20, (10+20));
		
		int a = 1;
		int b = 2;
		int c = a+b;
		
		System.out.println(); //괄호안에 아무 내용을 적지 않아도 \n의 내용을 포함하고 있기 때문에 오류X
		System.out.printf("%d + %d = %d", a,b,c);
	}	
}

/*
 * System.out.print("이 함수는 자동 줄바꿈이 없는 일반 출력함수입니다."); // 한글과, 영어문장
 * System.out.print(1234); // 숫자
 * System.out.print('A'); // 한글과 영어를 한글자만 (문자)
 * System.out.println("이 함수는 자동 줄바꿈이 있는 일반 출력함수입니다."); // 문장 끝에 \n 의 기능을 해줌.
 * ctrl+alt+아래방향키는 현재 줄의 자동 복사붙여넣기가 되는 커맨드이다.
 * System.out.printf("자료형", 출력내용);
 * %d 정수(10진수)
 * %o 정수(8진수)
 * %x 정수(16진수)
 * %f 실수
 * %c 문자
 * %s 문자열
 * -
 * %p 포인터 주소 값
 */