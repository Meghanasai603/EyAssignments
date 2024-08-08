package com.ey.mini_task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ey.mini_task.model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
