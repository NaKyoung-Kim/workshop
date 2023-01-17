package ws01;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("1. 이름을 입력하세요.");
		String name = s.nextLine();
		System.out.println("2. 나이를 입력하세요.");
		int age = s.nextInt();
		System.out.println("이름은 "+name+", 나이는 "+age+" 입니다");
		s.close();
	}
}
