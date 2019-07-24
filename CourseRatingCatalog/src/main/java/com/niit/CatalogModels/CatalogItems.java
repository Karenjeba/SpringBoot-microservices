package com.niit.CatalogModels;

public class CatalogItems {
	private String courseName;
	private String courseDesc;
	private int rating;
	
	public CatalogItems()
	{
		
	}
	public CatalogItems(String courseName, String courseDesc, int rating) {
		super();
		this.courseName = courseName;
		this.courseDesc = courseDesc;
		this.rating = rating;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDesc() {
		return courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

}
