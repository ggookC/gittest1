package ch01;

public class book {

	// 멤버 변수
	int id;
	String title;
	String author;
	
	public book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	// 생성자 멤버 3개를 입력, 한번에 받는 생성자를 만들어 주세요
	public void showInfo() {
		System.out.println("id :" + id);
		System.out.println("title : " + title);
		System.out.println("author :" + author);
	}
}
