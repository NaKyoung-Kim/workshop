package ws01;

public class Test14 {
	public static void main(String[] args) {

		String mesg = "100/200";
		int a = Integer.parseInt(mesg.split("/")[0]);
		int b = Integer.parseInt(mesg.split("/")[1]);
		System.out.println(a+b);
		System.out.println((a+b)/2);
	}
}