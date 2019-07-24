package com.niit.RatingRepository;

import org.springframework.data.repository.CrudRepository;

import com.niit.RatingModels.Rating;

public interface RatingRepo extends CrudRepository<Rating, String> {

}
