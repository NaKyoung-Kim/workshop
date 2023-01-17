package ws01;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("1. 정수 입력하세요.");
		int a = s.nextInt();
		System.out.println("2. 정수 입력하세요.");
		int b = s.nextInt();
		System.out.println("정수 "+a+"과 정수 "+b+"중에서 최대값: "+(a>b?a:b));
		s.close();
	}
}
