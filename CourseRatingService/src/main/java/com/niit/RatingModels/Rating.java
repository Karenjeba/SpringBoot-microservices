package com.niit.RatingModels;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Rating 
{
	@Id
private String courseId;
private int rating;

public Rating()
{
	
}

public Rating(String courseId, int rating) {
	super();
	this.courseId = courseId;
	this.rating = rating;
}
public String getCourseId() {
	return courseId;
}
public void setCourseId(String courseId) {
	this.courseId = courseId;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
}
