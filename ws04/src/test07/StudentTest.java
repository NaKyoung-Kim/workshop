package test07;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sArr[] = new Student[3];
		sArr[0] = new Student("홍", 15, 170, 80);
		sArr[1] = new Student("한", 13, 180, 70);
		sArr[2] = new Student("임", 16, 175, 65);
		
		int age=0, h = 0, w = 0;
		int max_age=-999, min_age=999;
		int max_h=-999, min_h=999;
		int max_w=-999, min_w=999;
		String max_age_name="", min_age_name="";
		String max_h_name="", min_h_name="";
		String max_w_name="", min_w_name="";
		
		for (Student student : sArr) {
			System.out.println(student.studentInfo());
			age+=student.getAge();
			h+=student.getHeight();
			w+=student.getWeight();
		}
		System.out.printf("%.3f \n", age/(double)3);
		System.out.printf("%.3f \n", h/(double)3);
		System.out.printf("%.3f \n", w/(double)3);
		
		for (Student s : sArr) {
			if(s.getAge() > max_age) {
				max_age = s.getAge();
				max_age_name = s.getName();
			}
			if(s.getAge() < min_age) {
				min_age = s.getAge();
				min_age_name = s.getName();
			}
			if(s.getHeight() > max_h) {
				max_h = s.getHeight();
				max_h_name = s.getName();
			} 
			if(s.getHeight() < min_h) {
				min_h = s.getHeight();
				min_h_name = s.getName();
			}
			if(s.getWeight() > max_w) {
				max_w = s.getWeight();
				max_w_name = s.getName();
			}
			if(s.getWeight() < min_w) {
				min_w = s.getWeight();
				min_w_name = s.getName();
			}
		}
		
		System.out.println(max_age_name);
		System.out.println(min_age_name);
		System.out.println(max_h_name);
		System.out.println(min_h_name);
		System.out.println(max_w_name);
		System.out.println(min_w_name);
	}

}
