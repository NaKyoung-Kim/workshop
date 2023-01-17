package ws01;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("주소를 입력하세요.");
		String a = s.nextLine();
		System.out.println("문자 갯수(공백포함): "+a.length());
		System.out.println("단어 갯수: "+a.split(" ").length);
		s.close();
	}
}
