package classpart;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;
 
	//public Student(){}  생성자가 하나도 없으면 디폴트 생성자를 컴파일러에서 자동으로 출력
	
	/*public Student(int id, String name) { 생성자를 만들어줌. 생성자 오버로딩
		studentID = id;
		studentName = name;
	}*/
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}

	/*
	 * public static void main(String[] args) { Student studentLee = new Student();
	 * studentLee.studentName = "이순신"; studentLee.address = "서울시 서초구 서초동";
	 * 
	 * studentLee.showStudentInfo(); }
	 */

	public String getStudentName() { // 학생이름을 반환해주는 메서드
		return studentName;
	}

	public void setStudentName(String name) { // 학생이름을 바꾸는 메소드, 바꿀이름이 매개변수로 들어옴.
		studentName = name; // 들어온 값을 studentName에 저장.
	}

	public static void main(String[] args) {

		Student studentLee = new Student(); // 객체는 반드시 생성해서 사용해야된다.
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.address = "서울시 서초구 서초동";

		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "서울시 영등포구 여의도동";

		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}
}
