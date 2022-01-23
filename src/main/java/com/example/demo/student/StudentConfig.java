package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 * @Author: Bazinga
 * @Date: 2022/1/19 - 01 - 19 - 14:58
 * @Description: demo
 * @Version: 1.0
 */
@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Zhuzijian = new Student(
                    1L,
                    "Zhuzijian",
                    "zzj@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,5)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.JANUARY,5)
            );
            repository.saveAll(
                    List.of(Zhuzijian,alex)
            );
        };
    }
}
