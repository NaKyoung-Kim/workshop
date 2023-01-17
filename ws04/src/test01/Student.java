package test01;

public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int korean, int english, int math, int science) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	public double getAvg() {
		return ((this.english+this.korean+this.math+this.science)/(double)4);
	}
	public String getGrade() {
		double avg = getAvg();
		String result;
		if(avg >= 90) {
			result = "A";
		} else if(avg >= 70) {
			result = "B";
		} else if(avg >= 50) {
			result = "C";
		} else if(avg >= 30) {
			result = "D";
		} else result = "F";
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}
	
	
}
