package srv.tpc;

import srv.dto.BookDTO;

// 기본자료형 Primitive DataType VS 사용자정의자료형 User Defined DataType
public class TPC10 {

	public static void main(String[] args) {

		// int, float, char, boolean ==> PDT
		int a = 10;
		
		// 책이라는 이름의 객체(자료형)를 생성 ==> UDDT를 class를 이용해서 만든다.
		BookDTO book = new BookDTO();
		book.title = "자바TPC";
		book.price = 23000;
		book.company = "한빛사";
		book.page = 722;
		
		System.out.println(book.title);
		System.out.println(book.price);
		System.out.println(book.company);
		System.out.println(book.page);
	}

}
