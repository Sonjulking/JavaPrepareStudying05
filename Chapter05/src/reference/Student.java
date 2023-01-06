package reference;

public class Student {

	int studentID;
	String studentName; //얘는 new하지 않아도 사용 가능. (String은...)

	Subject korea;
	Subject math;

	public Student() {
		korea = new Subject("국어");
		math = new Subject("수학");
	}

	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		korea = new Subject("국어");
		math = new Subject("수학");
	}

	public void setKorea(int score) {
		korea.setScore(score);

		// korea.subjectName = name; 이렇게 써도 상관없음. 프라이빗이 아니라서.
	}

	public void setMath(int score) {
		math.setScore(score);
	}

	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + " 학생의 총점은 " + total + " 점 입니다.");
	}

}
