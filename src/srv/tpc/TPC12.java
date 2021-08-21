package srv.tpc;

import srv.dto.BookDTO;

// 객체가 메모리에 어떻게 만들어지나(실습)
public class TPC12 {

	public static void main(String[] args) {
		
		// 생성자 ==> 생성 + 초기화 , 중복정의 가능.
		BookDTO book = new BookDTO();
		System.out.println(book.title);
		System.out.println(book.page);
		book.page = 722;
		System.out.println(book.page);
		
		System.out.println();
		
		BookDTO book2 = new BookDTO("Java Do it!", 27000, "대림", 922);
		System.out.println(book2.title);
		System.out.println(book2.price);
		System.out.println(book2.company);
		System.out.println(book2.page);
		
		
		
		
	}

}
