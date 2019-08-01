package com.niit.FacultyControllers;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.niit.FacultyModels.Course;
import com.niit.FacultyModels.Faculty;
import com.niit.FacultyModels.FacultyCourses;

@RestController
@RequestMapping("/faculty")
public class FacultyController 
{	
	@Autowired
	private RestTemplate rest;
@RequestMapping("/courses/{courseId}")
public Faculty getFaculty(@PathVariable	("courseId") String courseId)
{
	return new Faculty(courseId,"Tammy","MSc");
}
@RequestMapping("/faculty/{factId}")
public FacultyCourses getFacultyCourses(@PathVariable("factId") String factId)
{
	FacultyCourses facultyCourses = new FacultyCourses();
	facultyCourses.initData(factId);
	return facultyCourses;
}
	
@RequestMapping("/allcourses/{courseId}")
@ResponseBody
public Course getCourses(@PathVariable("courseId") String courseId)
{
	String url = "http://localhost:8085/course/";
	//URI uri = URI.create(url);
	//uri.getPath()
	
	//System.out.println(uri); 
	Course  c = rest.getForObject(url+courseId, Course.class);
	//List<Course> course = Arrays.asList(c);
	return c;
}
}
