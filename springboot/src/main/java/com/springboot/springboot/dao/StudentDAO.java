package com.springboot.springboot.dao;

import java.util.List;
import java.util.UUID;

import com.springboot.springboot.model.Student;

public interface StudentDAO {
	int insertNewStudent(UUID studentId, Student student);
	Student selectStudentById(UUID studentId);
	List<Student> selectAllStudents();
	int updateStudentById(UUID studentId,Student newStudent);
	int deleteStudentById(UUID studentId);
}
