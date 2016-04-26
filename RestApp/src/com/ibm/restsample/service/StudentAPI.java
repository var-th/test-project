package com.ibm.restsample.service;

import com.ibm.restsample.data.Student;

public interface StudentAPI {
	Student getName();
	Student setName(Student newStudent);
}
