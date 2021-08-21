package srv.tpc;

import srv.dto.BookDTO;
import srv.dto.PersonDTO;

//관계를 이해하라(V.D.A)
public class TPC03 {

	public static void main(String[] args) {

		// 정수 1개를 저장하는 변수
		int a = 22;
		
		// 책 1권을 저장하는 변수
		BookDTO book = new BookDTO();
		book.title = "자바의 정석";
		book.price = 27000;
		book.company = "한빛출판사";
		book.page = 722;
		
		System.out.println(book.title);
		System.out.println(book.price);
		System.out.println(book.company);
		System.out.println(book.page);
		
		
		// 회원 1명을 저장하는 변수
		PersonDTO person = new PersonDTO();
		person.age = 30;
		person.name = "장재영";
		person.weight = 90;
		person.height = 170;
	}

}
