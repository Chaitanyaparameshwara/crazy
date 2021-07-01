package com.learn.chaithu.entity;

public class course {

	public int id;
	public char coursename;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getCoursename() {
		return coursename;
	}
	public void setCoursename(char coursename) {
		this.coursename = coursename;
	}
	public course(int id, char coursename) {
		super();
		this.id = id;
		this.coursename = coursename;
	}
	public course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "course [id=" + id + ", coursename=" + coursename + "]";
	}
	
	
}
