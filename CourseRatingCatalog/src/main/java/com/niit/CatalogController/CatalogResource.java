package com.niit.CatalogController;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.niit.CatalogModels.CatalogItems;
import com.niit.CatalogModels.Course;
import com.niit.CatalogModels.UserRating;

@RestController
@RequestMapping("/catalog")
public class CatalogResource 
{
@Autowired
private RestTemplate restTemplate;

@RequestMapping("/{userId}")
	public List<CatalogItems> getCatalog(@PathVariable("userId") String userId)
	{
	System.out.println(userId);
		UserRating userRating = restTemplate.getForObject("http://course-rating-service/ratingsdata/user/"+userId, UserRating.class);
		return userRating.getRatings().stream().map(rating->
		{
			System.out.println(rating.getCourseId());
			Course c = restTemplate.getForObject("http://course-info-service/course/courselist/"+rating.getCourseId(), Course.class);
			return new CatalogItems(c.getCourseName(),c.getCourseDesc(),rating.getRating());
		}).collect(Collectors.toList());
	}

}
