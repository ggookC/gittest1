package ch01;

public class ArrayMainTest3 {

	public static void main(String[] args) {

		book book1 = new book(1, "�帣�� ����ó��", "�Ŀ���ڿ���");
		book book2 = new book(2, "�÷���UI����", "���ȣ");
		book book3 = new book(3, "����ȭ�����Ǿ����ϴ�", "������");
		book book4 = new book(4, "�������θ����϶�", "������");
		book book5 = new book(5, "���ǿ���", "�����϶�");

		// ����
		// 1. �迭�� �̿��ؼ� shoppingCart ����(�迭)�� ��ü�� ��ƺ��ô�.
		book[] shoppingCart = new book[5];
		// 2. ��� ���� å�� ��ٱ��Ͽ� 3���� ��� ���ô�.
		shoppingCart[0] = book1;
		shoppingCart[1] = book3;
		shoppingCart[2] = book4;
		// 3. ��ٱ��Ͽ� ���� ������ ȭ�鿡 ��� �ϼ���.
		// ���� ������ �ּ���!
		for (int i = 0; i < shoppingCart.length; i++) {
			if (shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
			}
		}
		// 4.
		shoppingCart[0] = book5;
		
		// 5. �ε��� 1��°�� book3 �߰����ּ���.
		// 0,1 = book3, 1-->2, 2-->3, 3-->3
		shoppingCart[0] = book2;
		shoppingCart[1] = book3;
		shoppingCart[2] = book4;
		shoppingCart[3] = book5;
		
		// �迭�� �߰��� �Ϸ��� ���� �ε��� �������ؼ� ó���ؾ��Ѵ�.
		
	}

}
