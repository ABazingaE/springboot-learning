package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @Author: Bazinga
 * @Date: 2022/1/19 - 01 - 19 - 11:06
 * @Description: demo
 * @Version: 1.0
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    //@Query("select s from Student s where s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}



