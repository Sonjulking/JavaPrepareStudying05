package classpart;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;
 
	//public Student(){}  �����ڰ� �ϳ��� ������ ����Ʈ �����ڸ� �����Ϸ����� �ڵ����� ���
	
	/*public Student(int id, String name) { �����ڸ� �������. ������ �����ε�
		studentID = id;
		studentName = name;
	}*/
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}

	/*
	 * public static void main(String[] args) { Student studentLee = new Student();
	 * studentLee.studentName = "�̼���"; studentLee.address = "����� ���ʱ� ���ʵ�";
	 * 
	 * studentLee.showStudentInfo(); }
	 */

	public String getStudentName() { // �л��̸��� ��ȯ���ִ� �޼���
		return studentName;
	}

	public void setStudentName(String name) { // �л��̸��� �ٲٴ� �޼ҵ�, �ٲ��̸��� �Ű������� ����.
		studentName = name; // ���� ���� studentName�� ����.
	}

	public static void main(String[] args) {

		Student studentLee = new Student(); // ��ü�� �ݵ�� �����ؼ� ����ؾߵȴ�.
		studentLee.studentName = "�̼���";
		studentLee.studentID = 100;
		studentLee.address = "����� ���ʱ� ���ʵ�";

		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.studentID = 101;
		studentKim.address = "����� �������� ���ǵ���";

		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}
}
