package com.gyojincompany;

public class Response {
	
	private Long idx;
	private String id;
	private String name;
	private Long phone;
	private String email;
	public Response(Long idx, String id, String name, Long phone, String email) {
		super();
		this.idx = idx;
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdx() {
		return idx;
	}
	public void setIdx(Long idx) {
		this.idx = idx;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void success() {
		System.out.println("성공");
	}
	
}
