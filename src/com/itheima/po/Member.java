package com.itheima.po;

public class Member {
	private Integer member_id;
	private Integer user_id;
	private String member_headpic;
	private String member_name;
	private String validation;
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getMember_headpic() {
		return member_headpic;
	}
	public void setMember_headpic(String member_headpic) {
		this.member_headpic = member_headpic;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getValidation() {
		return validation;
	}
	public void setValidation(String validation) {
		this.validation = validation;
	}
	@Override
	public String toString() {
		return "member [member_id=" + member_id + ", user_id=" + user_id + ", member_headpic=" + member_headpic
				+ ", member_name=" + member_name + ", validation=" + validation + "]";
	}
	
}
