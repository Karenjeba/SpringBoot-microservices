package com.niit.RatingModels;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class UserRating {
	@Id
private String userId;
	@OneToMany
	private List<Rating> ratings;
public UserRating()
{
	
}
public UserRating(String userId, List<Rating> ratings) {
	super();
	this.userId = userId;
	this.ratings = ratings;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public List<Rating> getRatings() {
	return ratings;
}
public void setRatings(List<Rating> ratings) {
	this.ratings = ratings;
}



}
