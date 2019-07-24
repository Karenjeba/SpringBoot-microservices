package com.niit.CourseService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.CourseModels.Course;
import com.niit.CourseRepo.CourseInfoRepository;

@Service
public class CourseInfoService {
	@Autowired
private CourseInfoRepository courseInfoRepository;
	public List<Course> getAllCourses() {
		List<Course> courseList = new ArrayList<>();
		courseInfoRepository.findAll().forEach(courseList::add);
		return courseList;
	}

	public Course getCourseById(String courseId)
	{
		return courseInfoRepository.findById(courseId).orElse(new Course());
	}

	public void addCourse(Course course) {
		courseInfoRepository.save(course);
		
	}
}
