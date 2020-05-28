package com.itheima.po;

public class User {
	private Integer user_id;
	private String user_tel;
	private String user_pwd;
	private String user_name;
	private String user_headpic;
	private String user_regdate;
	private String user_lastlogin;
	private String validation;
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_tel() {
		return user_tel;
	}
	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_headpic() {
		return user_headpic;
	}
	public void setUser_headpic(String user_headpic) {
		this.user_headpic = user_headpic;
	}
	public String getUser_regdate() {
		return user_regdate;
	}
	public void setUser_regdate(String user_regdate) {
		this.user_regdate = user_regdate;
	}
	public String getUser_lastlogin() {
		return user_lastlogin;
	}
	public void setUser_lastlogin(String user_lastlogin) {
		this.user_lastlogin = user_lastlogin;
	}
	public String getValidation() {
		return validation;
	}
	public void setValidation(String validation) {
		this.validation = validation;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_tel=" + user_tel + ", user_pwd=" + user_pwd + ", user_name="
				+ user_name + ", user_headpic=" + user_headpic + ", user_regdate=" + user_regdate + ", user_lastlogin="
				+ user_lastlogin + ", validation=" + validation + "]";
	}
	

}
