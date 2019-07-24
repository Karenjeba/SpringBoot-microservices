package com.niit.RatingsService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.RatingModels.Rating;
import com.niit.RatingModels.UserRating;
import com.niit.RatingRepository.RatingRepo;
import com.niit.RatingRepository.UserRatingRepo;
@Service
public class CourseRatingService {

	@Autowired
	private RatingRepo ratingrepo;
	@Autowired
	private UserRatingRepo userRatingRepo;
	public Rating getByCourseId(String courseId) {
		
		return ratingrepo.findById(courseId).orElse(new Rating());
	}
	public UserRating getRatingByUserId(String userId) {
		
		return userRatingRepo.findById(userId).orElse(new UserRating());
	}
	public List<UserRating> getAllRatings() {
		List<UserRating> urlist = new ArrayList<>();
		userRatingRepo.findAll().forEach(urlist::add);
		return urlist;
		
	}
	public void addUserRating(UserRating user) {
		userRatingRepo.save(user);
		
	}

}
