package classpart;

public class ShoppingMallTest {
	
	public static void main(String[] args) {
		ShoppingMall shoppingmall = new ShoppingMall();
		shoppingmall.orderNum = 201907210001L;
		shoppingmall.ID = "abc123";
		shoppingmall.date = "2019년 7월 21일";
		shoppingmall.name = "홍길순";
		shoppingmall.product = "PD0345-12";
		shoppingmall.addr = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호: "+ shoppingmall.orderNum);
		System.out.println("주문자 아이디: "+ shoppingmall.ID);
		System.out.println("주문 날짜: "+ shoppingmall.date);
		System.out.println("주문자 이름: "+ shoppingmall.name);
		System.out.println("주문 상품 번호: "+ shoppingmall.product);
		System.out.println("배송 주소: "+ shoppingmall.addr);
	}
}
