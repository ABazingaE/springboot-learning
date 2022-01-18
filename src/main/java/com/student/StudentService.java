package com.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 * @Author: Bazinga
 * @Date: 2022/1/18 - 01 - 18 - 18:34
 * @Description: demo
 * @Version: 1.0
 */
@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Zhuzijian",
                        "zzj@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,5),
                        21
                )
        );
    }
}
