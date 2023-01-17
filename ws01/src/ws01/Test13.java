package ws01;

public class Test13 {
	public static void main(String[] args) {

		String mesg = "    홍길동/이순신/유관순           ";
		System.out.println(mesg.length());
		System.out.println(mesg.trim());
		System.out.println(mesg.trim().length());
		System.out.println(mesg.trim().substring(0, 7));
		System.out.println(mesg.trim().split("/")[0]);
		System.out.println(mesg.trim().split("/")[2]);
	}
}