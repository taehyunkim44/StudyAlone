package array;

public class ObjectCopy2 {
	
	public static void main(String[] args) {
	
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1","조정례");
		library[1] = new Book("태백산맥2","조정례");
		library[2] = new Book("태백산맥3","조정례");
		library[3] = new Book("태백산맥4","조정례");
		library[4] = new Book("태백산맥5","조정례");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		// 향상된 for 문
//		for( Book book : copyLibrary) {
//			book.showBookInfo();
//		}
//		for( Book book : library) {
//			book.showBookInfo();
//		}
		
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		// 객체 배열 복사 - 얕은 복사(주소만 복사됨)
		for( Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("======================");
		
		for( Book book : copyLibrary) {
			book.showBookInfo();
		}
	
	
	}
}
