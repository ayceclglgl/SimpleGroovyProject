package com.groovybean

import groovy.transform.ToString


//Groovy bean corresponds the java bean called 'EmployeeBean;
@groovy.transform.ToString
class Employee implements Serializable {
	
	String firstName, lastName, email;
}
