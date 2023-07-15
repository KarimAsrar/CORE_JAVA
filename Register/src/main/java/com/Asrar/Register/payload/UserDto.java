package com.Asrar.Register.payload;

public class UserDto {
	private int userId;
	private String username;
	private String useremail;
	private String password;
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDto(int userId, String username, String useremail, String password) {
		super();
		this.userId = userId;
		this.username = username;
		this.useremail = useremail;
		this.password = password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", username=" + username + ", useremail=" + useremail + ", password="
				+ password + "]";
	}
	
	
}
