package reference;

public class Student {

	int studentID;
	String studentName; //��� new���� �ʾƵ� ��� ����. (String��...)

	Subject korea;
	Subject math;

	public Student() {
		korea = new Subject("����");
		math = new Subject("����");
	}

	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		korea = new Subject("����");
		math = new Subject("����");
	}

	public void setKorea(int score) {
		korea.setScore(score);

		// korea.subjectName = name; �̷��� �ᵵ �������. �����̺��� �ƴ϶�.
	}

	public void setMath(int score) {
		math.setScore(score);
	}

	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + " �л��� ������ " + total + " �� �Դϴ�.");
	}

}
