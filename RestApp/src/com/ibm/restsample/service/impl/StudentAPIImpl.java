package com.ibm.restsample.service.impl;

import com.ibm.restsample.data.Student;
import com.ibm.restsample.service.StudentAPI;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Consumes("application/json")
@Produces("application/json")
public class StudentAPIImpl implements StudentAPI {

	
	@Path("/getName")
	@GET
	public Student getName() {
	    Student student = new Student();
	    student.setName("Varada");
	    return student;
	}

	@POST
	@Path("/setName")
	public Student setName(Student newStudent) {
		newStudent.setName("HELLO " + newStudent.getName());
	    return newStudent;
	}

}
