package com.niit.RatingRepository;

import org.springframework.data.repository.CrudRepository;

import com.niit.RatingModels.UserRating;

public interface UserRatingRepo extends CrudRepository<UserRating, String> {

}
