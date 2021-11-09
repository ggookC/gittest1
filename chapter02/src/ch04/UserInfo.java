package ch04;

public class UserInfo {

	String userId;
	String userPassWord;
	String userName;
	String userAddress;
	String phoneNumber;
	
	
	// ������ �����ε�
	// �߿�! �����ڴ� ��ü�� ������ �� ó�� ����Ǵ� �ڵ��Դϴ�.
	
	// alt + shift + s, o

	// 1. �⺻ �����ڸ� ����� �ּ���.
	public UserInfo() {}
	
	// 2. userId �� �޴� �����ڸ� ����� �ּ���.
	public UserInfo(String userId) {
		this.userId = userId;
	}
	
	// 3. userId, userPassword �� �޴� �����ڸ� ����� �ּ���.
	public UserInfo(String userId, String userPassword) {
		this.userId = userId;
		this.userPassWord = userPassword;
	}
	
	// 4. userId, userPassword, userName �� �޴� �����ڸ� ����� �ּ���.
	public UserInfo(String userId, String userPassword, String userName) {
		this.userId = userId;
		this.userPassWord = userPassword;
		this.userName = userName;
	}
	
	// 5. userId, userPassword, userName, userAddress
	public UserInfo(String userId, String userPassword, String userName, String userAddress) {
		this.userId = userId;
		this.userPassWord = userPassword;
		this.userName = userName;
		this.userAddress = userAddress;
	}
	
	// 6. userId, userPassword, userName, userAddress, phoneNumber
	public UserInfo(String userId, String userPassword, String userName, String userAddress, String phoneNumber) {
		this.userId = userId;
		this.userPassWord = userPassword;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
	}
}