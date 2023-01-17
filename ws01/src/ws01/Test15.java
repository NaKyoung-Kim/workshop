package ws01;

import java.util.Scanner;

public class Test15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("정수1");
		int a = s.nextInt();
		System.out.println("정수2");
		int b = s.nextInt();
		System.out.println("정수3");
		int c = s.nextInt();
		int max = a>b && a>c ? a : ((b>c && b>a)? b : c);
		System.out.println("최대값: "+max);
	}
}