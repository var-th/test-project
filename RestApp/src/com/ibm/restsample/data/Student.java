package com.ibm.restsample.data;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="student")
public class Student {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
