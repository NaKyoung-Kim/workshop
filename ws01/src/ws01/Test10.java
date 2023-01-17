package ws01;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("주소를 입력하세요.");
		String a = s.next();
		String b = s.next();
		String c = s.next();
		System.out.println("도명: "+a);
		System.out.println("시명: "+b);
		System.out.println("구명: "+c);
		s.close();
	}
}
