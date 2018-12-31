package com.springboot.dubbo.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 学生信息类
 * @author Administrator
 *
 */
public class StudentVO  implements Serializable{
	
	private Integer id;//学号
	
	private String sname;//姓名
	
	private String ssex;//学生性别
	
	private Integer sage;//学生年龄
	
	private Date birthday;//学生家庭住址

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSsex() {
		return ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public Integer getSage() {
		return sage;
	}

	public void setSage(Integer sage) {
		this.sage = sage;
	}
	 
}