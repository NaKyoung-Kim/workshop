package test06;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("홍", 15,171,81);
		Student s2 = new Student("한", 13,183,72);
		Student s3 = new Student("임", 16,175,65);
		
		Student stuArr[] = new Student[3];
		stuArr[0] = s1;
		stuArr[1] = s2;
		stuArr[2] = s3;
		
		int age = 0, h=0, w=0;
		for (Student student : stuArr) {
			System.out.println(student);
			age+=student.getAge();
			h+=student.getHeight();
			w+=student.getWeight();
		}
		
		System.out.printf("%.2f", age/(double)3);
		System.out.println();
		System.out.printf("%.2f", h/(double)3);
		System.out.println();
		System.out.printf("%.2f", w/(double)3);		
	}

}
