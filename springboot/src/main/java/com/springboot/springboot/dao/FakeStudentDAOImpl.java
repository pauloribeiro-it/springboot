package com.springboot.springboot.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.springboot.springboot.model.Student;

@Repository("fakeDao")
public class FakeStudentDAOImpl implements StudentDAO{

	private final Map<UUID,Student> database;
	
	public FakeStudentDAOImpl() {
		database = new HashMap<>();
	    UUID studentId = UUID.randomUUID();
	    database.put(
	        studentId,
	        new Student(studentId, 14, "Alex", "Montana", "Computer Science")
	    );
	}

	public int insertNewStudent(UUID studentId, Student student) {
		database.put(studentId, student);
		return 1;
	}

	public Student selectStudentById(UUID studentId) {
		return database.get(studentId);
	}

	public List<Student> selectAllStudents() {
		return new ArrayList<Student>(database.values());
	}

	public int updateStudentById(UUID studentId, Student studentUpdate) {
		database.put(studentId, studentUpdate);
		return 1;
	}

	public int deleteStudentById(UUID studentId) {
		database.remove(studentId);
		return 1;
	}

}
