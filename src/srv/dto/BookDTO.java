package srv.dto;

public class BookDTO {

	public String title;
	public int price;
	public String company;
	public int page;
	
	//디폴트 생성자 메소드 ==> 객체를 생성하는 작업을 한다. 
	public BookDTO() {
//		super();	// 상속과 관련, 생략 가능
		this.title = "파이썬의 정석";
		this.price = 1500;
		this.company = "이지스";
		this.page = 460;			//  <== 초기화 작업
		
	}
	
	public BookDTO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
}
