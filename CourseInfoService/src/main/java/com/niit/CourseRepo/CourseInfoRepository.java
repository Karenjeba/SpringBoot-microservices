package com.niit.CourseRepo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.niit.CourseModels.Course;
@Repository		
public interface CourseInfoRepository extends CrudRepository<Course, String>{

}
