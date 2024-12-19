package com.sgm.sgmwebpro.Services;

import com.sgm.sgmwebpro.Model.Student;
import com.sgm.sgmwebpro.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepo;

//    public List<Student> students = new ArrayList<>(Arrays.asList(
//            new Student(101,"saravana","CSE"),
//            new Student(102,"Lashu","CSE"),
//            new Student(103,"ilakki","ECE")
//            ));

    public List<Student> getStudents(){
        return studentRepo.findAll();
    }

    public Student getstubyid(int stuid) {
        return studentRepo.findById(stuid).orElse(new Student());
    }

    public void addstudent(Student stu){
         studentRepo.save(stu);
    }

    public void updatestudent(Student stus) {
       studentRepo.save(stus);
    }

    public void deletestu(int studs) {
        studentRepo.deleteById(studs);
    }
}
