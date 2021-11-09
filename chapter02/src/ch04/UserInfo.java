package ch04;

public class UserInfo {

	String userId;
	String userPassWord;
	String userName;
	String userAddress;
	String phoneNumber;
	
	
	// 생성자 오버로딩
	// 중요! 생성자는 객체가 생성될 때 처음 실행되는 코드입니다.
	
	// alt + shift + s, o

	// 1. 기본 생성자를 만들어 주세요.
	public UserInfo() {}
	
	// 2. userId 만 받는 생성자를 만들어 주세요.
	public UserInfo(String userId) {
		this.userId = userId;
	}
	
	// 3. userId, userPassword 만 받는 생성자를 만들어 주세요.
	public UserInfo(String userId, String userPassword) {
		this.userId = userId;
		this.userPassWord = userPassword;
	}
	
	// 4. userId, userPassword, userName 만 받는 생성자를 만들어 주세요.
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