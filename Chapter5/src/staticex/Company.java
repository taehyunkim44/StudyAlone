package staticex;

// 싱글톤 패턴
public class Company {

// 내부에서 사용할 수 있는 Company 메서드로 instance 생성
	private static Company instance = new Company();

// private로 내부에서 밖에 사용할 수 없음
	private Company() {}

// 외부에서 인스턴스 생성과 상관 없이 호출해 갈 수 있게 하기 위해 static
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
