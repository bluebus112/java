package com.ktds.jjh.teacher;

import com.ktds.jjh.student.Student;

public class Teacher {
	
	public void teach(String subject, Student student) {
		System.out.println(subject + "를 가르칩니다.");
		student.study(subject);
	}

}
