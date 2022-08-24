package com.gyojincompany;

import io.swagger.annotations.ApiModelProperty;

public class UserReq {
	@ApiModelProperty(value="사용자의 이름", example = "홍길동", required = true)
    private String name;

    @ApiModelProperty(value="사용자의 나이", example = "10", required = true)
    private int age;

	public UserReq(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public UserReq() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
    
    
}
