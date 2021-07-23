package silsub1.model.vo;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	//기본생성자. 이전에는 jvm이 자동으로 생성해줬어서 안썼던 것..
	public Member() {}
	
	
	//setter메소드
	//필드값을 변경하기 위한 메소드
	//괄호 안에 매개변수를 통해 전달받은 값으로 필드값 변경
	public void setMemberId(String memberId) {
		this.memberId = memberId;
		
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;	
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//getter 메소드
	//getter메소드를 이용하여 직접 접근이 불가능한 필드값에 접근한다.
	public String getMemberId() {
		return memberId;
	}
	
	public String getMemberPwd() {
		return memberPwd;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public int getAge() {
		return this.age; //똑같음.
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
