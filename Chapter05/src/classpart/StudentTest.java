package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.address = "����� ���ʱ� ���ʵ�";

		studentLee.showStudentInfo();
		
		System.out.println(studentLee); // studentLee�� �� �޸𸮿� ������ �ּ� ���.
	}
}
