package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: Bazinga
 * @Date: 2022/1/19 - 01 - 19 - 11:06
 * @Description: demo
 * @Version: 1.0
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}


/*
List.of(
        new Student(
        1L,
        "Zhuzijian",
        "zzj@gmail.com",
        LocalDate.of(2000, Month.JANUARY,5),
        21
        )
        )*/
