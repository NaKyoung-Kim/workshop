package test02;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("SQL plus", 50000, 5.0);
		Book b2 = new Book("Java 2.0", 40000, 3.0);
		Book b3 = new Book("JSP servlet", 60000, 6.0);
		
		System.out.println(b1.getBookName()+"\t"+b1.getBookPrice()+"\t"+b1.getBookDiscountRate()+"\t"+b1.getDiscountBookPrice());
		System.out.println(b2.getBookName()+"\t"+b2.getBookPrice()+"\t"+b2.getBookDiscountRate()+"\t"+b2.getDiscountBookPrice());
		System.out.println(b3.getBookName()+"\t"+b3.getBookPrice()+"\t"+b3.getBookDiscountRate()+"\t"+b3.getDiscountBookPrice());
	}

}
