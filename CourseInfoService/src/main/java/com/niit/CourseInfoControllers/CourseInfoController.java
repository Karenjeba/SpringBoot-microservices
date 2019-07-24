package com.niit.CourseInfoControllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.niit.CourseModels.Course;
import com.niit.CourseService.CourseInfoService;
@RestController
@RequestMapping("/course")
public class CourseInfoController {
	@Autowired
	private CourseInfoService service;
	@RequestMapping("/course")
	public ModelAndView welcome() 
	{ 
	ModelAndView model = new ModelAndView();
	 model.setViewName("course"); 
	 return model; 
	 }
	@RequestMapping("/addCourse")
	public ModelAndView courseAdd(Course course)
	{
		service.addCourse(course);
		ModelAndView model = new ModelAndView();
		 model.setViewName("courseId");
		return model;
	}
	@RequestMapping("/getCourse")
	public ModelAndView getCourseById(@RequestParam String courseId)
	{
		Course course =  service.getCourseById(courseId);
		ModelAndView model = new ModelAndView();
		model.addObject(course);
		model.setViewName("showCourse");
		return model;
		
	}
	
	@RequestMapping("/courselist")
	@ResponseBody
	public List<Course> getAllCourses()
	{
	return service.getAllCourses();
			
	}
	
	@RequestMapping("/courselist/{courseId}")
	@ResponseBody
	public Course getCourseByIdParam(@PathVariable String courseId)
	{
	return service.getCourseById(courseId);
	}
	
	@RequestMapping(method=RequestMethod.POST,value = "/addCourses") 
	public void addCourse(@RequestBody Course course) 
	{ 
		service.addCourse(course); 
	}
	
	

}
