package ch01;

public class book {

	// ��� ����
	int id;
	String title;
	String author;
	
	public book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	// ������ ��� 3���� �Է�, �ѹ��� �޴� �����ڸ� ����� �ּ���
	public void showInfo() {
		System.out.println("id :" + id);
		System.out.println("title : " + title);
		System.out.println("author :" + author);
	}
}
