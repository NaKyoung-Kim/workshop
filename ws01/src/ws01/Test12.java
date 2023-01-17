package ws01;

public class Test12 {
	public static void main(String[] args) {
		String mesg = "heLLO";
		System.out.println(mesg.toUpperCase());
		System.out.println(mesg.toLowerCase());
		System.out.println(mesg.length());
		System.out.println(mesg.charAt(1));
		System.out.println(mesg.concat("~~~"));
		System.out.println(mesg.contains("h"));
		System.out.println(mesg.contains("he"));
		System.out.println(mesg.contains("hw"));
		System.out.println(mesg.endsWith("h"));
		System.out.println(mesg.startsWith("h"));
		System.out.println(mesg.replace("O", "X"));
		System.out.println(mesg.equals("HELLO"));
		System.out.println(mesg.equalsIgnoreCase("HELLO"));
	}
}