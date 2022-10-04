package com.fedex.notification.service.model;

public class UserProfile {
	
	String name;
	long phone_no;
	long country_code;
	String preferred_lang;
	
	
	public UserProfile(String name, long phone_no, long country_code, String preferred_lang) {
		super();
		this.name = name;
		this.phone_no = phone_no;
		this.country_code = country_code;
		this.preferred_lang = preferred_lang;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public long getCountry_code() {
		return country_code;
	}
	public void setCountry_code(long country_code) {
		this.country_code = country_code;
	}
	public String getPreferred_lang() {
		return preferred_lang;
	}
	public void setPreferred_lang(String preferred_lang) {
		this.preferred_lang = preferred_lang;
	}
	
	
	
}
