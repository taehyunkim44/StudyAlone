package staticex;

import java.util.Calendar;

// 싱글톤 패턴
public class CompanyTest {
	
	public static void main(String[] args) {
		
		Company company1 = Company.getInstance();
		
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		// 불러올 때 매개변수에 따라 다른 것들이 반환, 가져오는 방식은 getInstance 하나
		Calendar calendar = Calendar.getInstance();
	}
}
