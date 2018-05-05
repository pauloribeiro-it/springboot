package com.springboot.springboot.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.springboot.springboot.model.Student;

@Repository("mongoDb")
public class MongoDBStudentDaoImpl implements StudentDAO{

	
	public int insertNewStudent(UUID studentId, Student student) {
		return 0;
	}

	public Student selectStudentById(UUID studentId) {
		return null;
	}

	public List<Student> selectAllStudents() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(UUID.randomUUID(),10,"Mongo","DB","NOsql"));
		return students;
	}

	public int updateStudentById(UUID studentId, Student newStudent) {
		return 0;
	}

	public int deleteStudentById(UUID studentId) {
		return 0;
	}

}
