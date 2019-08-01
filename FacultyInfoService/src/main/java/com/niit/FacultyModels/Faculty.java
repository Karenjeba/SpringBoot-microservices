package com.niit.FacultyModels;

public class Faculty {
	private String courseId;
	public Faculty(String courseId, String factName, String factQual) {
		super();
		this.courseId = courseId;
		this.factName = factName;
		this.factQual = factQual;
	}
	private String factName;
	private String factQual;
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getFactName() {
		return factName;
	}
	public void setFactName(String factName) {
		this.factName = factName;
	}
	public String getFactQual() {
		return factQual;
	}
	public void setFactQual(String factQual) {
		this.factQual = factQual;
	}
	public Faculty()
	{
		
	}
	
	
}
