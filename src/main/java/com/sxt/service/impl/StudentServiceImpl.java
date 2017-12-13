package com.sxt.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.sxt.entity.Student;
import com.sxt.service.StudentService;

public class StudentServiceImpl implements StudentService {

	private List<Student> students=new ArrayList<Student>();
	
	public StudentServiceImpl(){
		students.add(new Student("张三", "男", 20));
		students.add(new Student("李四", "男", 21));
	}
	@Override
	public List<Student> showStudent() {
			
		return students;
	}

}
