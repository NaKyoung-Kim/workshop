package test01;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student k = new Student("Kim", 100, 90, 95, 89);
		Student l = new Student("Lee", 60, 70, 99, 98);
		Student p = new Student("Park", 68, 86, 60, 40);
		
		System.out.println(k.getAvg()+", "+k.getGrade());
		System.out.println(l.getAvg()+", "+l.getGrade());
		System.out.println(p.getAvg()+", "+p.getGrade());
	}

}
