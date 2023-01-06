package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 서초구 서초동";

		studentLee.showStudentInfo();
		
		System.out.println(studentLee); // studentLee의 힙 메모리에 생성된 주소 출력.
	}
}
