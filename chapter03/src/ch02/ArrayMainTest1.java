package ch02;

import java.util.ArrayList;

import ch01.book;

public class ArrayMainTest1 {

	public static void main(String[] args) {
		
		book book1 = new book(1, "�帣�� ����ó��", "�Ŀ���ڿ���");
		book book2 = new book(2, "�÷���UI����", "���ȣ");
		book book3 = new book(3, "����ȭ�����Ǿ����ϴ�", "������");
		book book4 = new book(4, "�������θ����϶�", "������");
		book book5 = new book(5, "���ǿ���", "�����϶�");
	
		// ArrayList ����
		
		// �����͸� ���� ���� �����
		// ! ArrayList �� �迭�� �޸� ������ ũ�⸦ ���� ������ �ʿ䰡 ����.
		ArrayList<book> shoppingCart = new ArrayList<book>();
		
		// �߰� ��� 1
		// ������ �߰��ϱ�
		// shoppingCart[0] = ""
		shoppingCart.add(book1);
		shoppingCart.add(book2);
		shoppingCart.add(book3);
		shoppingCart.add(book4);
		
		// ȭ�鿡 ���
		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}
		System.out.println("====================");
		// �߰� ��� 2
		shoppingCart.add(2, book5);
		// for�� 2��° ���
		for (book b : shoppingCart) {
			b.showInfo();
		}
		System.out.println("====================");
		// �����ϱ�
		shoppingCart.remove(0);
		// foreach
		 
//		shoppingCart.clear(); // ���� ����
		for(book book : shoppingCart) {
			book.showInfo();
		}
		System.out.println("====================");
		// �����ϱ�
		shoppingCart.set(2, book1);
		// foreach�� �����ؼ� ȭ�鿡 ���
		for(book book : shoppingCart) {
			book.showInfo();
		}
		
		// C R U D
		
		// create, read, update, delete
	}

}
