package classpart;

public class Student {
	
// private : 클래스 내부에서만 쓰는 변수 , 외부에서 참조할 수 없다.
	
	private int studentID;
	public String studentName;
	public String address;

//  같은 이름의 메서드,생성자 여러개, 매개변수가 다를때 : 오버로딩 
	public Student(String name) {
		studentName = name;
	}
	
//  default 생성자
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소 없음";
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
//	public static void main(String[] args) {
//		
//		Student studentPark = new Student();
//		studentPark.studentName = "박은종";
//		studentPark.showStudentInfo();
//	}
}
