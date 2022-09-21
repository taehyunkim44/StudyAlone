package array;

public class ObjectCopy {
	
	public static void main(String[] args) {
	
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1","조정례");
		library[1] = new Book("태백산맥2","조정례");
		library[2] = new Book("태백산맥3","조정례");
		library[3] = new Book("태백산맥4","조정례");
		library[4] = new Book("태백산맥5","조정례");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3	] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i = 0; i < library.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		// 객체 배열 복사 - 깊은 복사(서로 다른 인스턴스)
		for( Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("======================");
		
		for( Book book : copyLibrary) {
			book.showBookInfo();
		}
	
	
	}
}
