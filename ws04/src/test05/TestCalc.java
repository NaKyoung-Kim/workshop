package test05;

public class TestCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(Integer.parseInt(args[0]) > 10 | Integer.parseInt(args[0]) < 5) {
			System.out.println("다시 입력하세요");
		} else {
			Calc c = new Calc();
			System.out.println(c.calculate(Integer.parseInt(args[0])));
		}
	}

}
