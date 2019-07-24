package com.niit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.niit.RatingModels.Course;
import com.niit.RatingModels.Rating;
import com.niit.RatingModels.UserRating;
import com.niit.RatingsService.CourseRatingService;

@RestController
@RequestMapping("/ratingsdata")
public class CourseRatingServiceController 
{
	@Autowired
	public CourseRatingService courseRatingService;
	@Autowired
	private RestTemplate restTemplate;
	@RequestMapping("/userRating")
	public List<UserRating> getAllRatings()
	{
		return courseRatingService.getAllRatings();	
	}
@RequestMapping("/course/{courseId}")
public Rating getCourseRating(@PathVariable("courseId") String courseId)
{
	return  courseRatingService.getByCourseId(courseId);
}

@RequestMapping("/user/{userId}")
public UserRating getUserRatings(@PathVariable("userId") String userId)
{
	UserRating userRating = new UserRating();
	userRating = courseRatingService.getRatingByUserId(userId);
	return userRating;
}

@RequestMapping(method=RequestMethod.POST,value = "/addUserRating") 
public void addUserRating(@RequestBody UserRating user)
{ 
	courseRatingService.addUserRating(user); 
}


}	