package com.itheima.po;

public class Item {

	private Integer item_id;
	private Integer member_id;
	private String item_title;
	private String item_target;
	private String item_resume;
	private String item_createtime;
	private String item_remind;
	private String item_picture;
	private String item_finish;
	private String validation;
	public Integer getItem_id() {
		return item_id;
	}
	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public String getItem_title() {
		return item_title;
	}
	public void setItem_title(String item_title) {
		this.item_title = item_title;
	}
	public String getItem_target() {
		return item_target;
	}
	public void setItem_target(String item_target) {
		this.item_target = item_target;
	}
	public String getItem_resume() {
		return item_resume;
	}
	public void setItem_resume(String item_resume) {
		this.item_resume = item_resume;
	}
	public String getItem_createtime() {
		return item_createtime;
	}
	public void setItem_createtime(String item_createtime) {
		this.item_createtime = item_createtime;
	}
	public String getItem_remind() {
		return item_remind;
	}
	public void setItem_remind(String item_remind) {
		this.item_remind = item_remind;
	}
	public String getItem_picture() {
		return item_picture;
	}
	public void setItem_picture(String item_picture) {
		this.item_picture = item_picture;
	}
	public String getItem_finish() {
		return item_finish;
	}
	public void setItem_finish(String item_finish) {
		this.item_finish = item_finish;
	}
	public String getValidation() {
		return validation;
	}
	public void setValidation(String validation) {
		this.validation = validation;
	}
	@Override
	public String toString() {
		return "Item [item_id=" + item_id + ", member_id=" + member_id + ", item_title=" + item_title + ", item_target="
				+ item_target + ", item_resume=" + item_resume + ", item_createtime=" + item_createtime
				+ ", item_remind=" + item_remind + ", item_picture=" + item_picture + ", item_finish=" + item_finish
				+ ", validation=" + validation + "]";
	}
	
}
