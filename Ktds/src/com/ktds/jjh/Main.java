package com.ktds.jjh;

import com.ktds.jjh.teacher.Teacher;
import com.ktds.jjh.student.Student;

public class Main {
	
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		Student student = new Student();
		
		teacher.teach("Oracle Database", student);
		//student.study("Oracle Database");
		
		
		
	}

}
