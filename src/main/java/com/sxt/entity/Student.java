package com.sxt.entity;

import java.io.Serializable;

public class Student implements Serializable {
	
	private String sName;
	private String sex;
	private Integer age;
	
	
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	public Student() {
		
	}
	public Student(String sName, String sex, Integer age) {
		super();
		this.sName = sName;
		this.sex = sex;
		this.age = age;
	}
	
	

}
