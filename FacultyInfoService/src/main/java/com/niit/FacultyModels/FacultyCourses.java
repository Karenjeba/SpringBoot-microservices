package com.niit.FacultyModels;

import java.util.Arrays;
import java.util.List;

public class FacultyCourses {
	private String factId;
	private List<Faculty> faculty;
	public FacultyCourses()
	{
		
	}
	
	public FacultyCourses(String factId, List<Faculty> faculty) {
		super();
		this.factId = factId;
		this.faculty = faculty;
	}

	public String getFactId() {
		return factId;
	}

	public void setFactId(String factId) {
		this.factId = factId;
	}

	public List<Faculty> getFaculty() {
		return faculty;
	}
	public void setFaculty(List<Faculty> faculty) {
		this.faculty = faculty;
	}
	public void initData(String factId) {
		this.setFactId(factId);
		this.setFaculty(Arrays.asList(
				new Faculty("c101","Dora","B.E"),
				new Faculty("c101","Harry","B.Ed"),
				new Faculty("c102","Gary","B.E")));
	}
        
}
