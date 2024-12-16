package com.sgm.sgmwebpro.Services;

import com.sgm.sgmwebpro.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    public List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(101,"saravana","CSE"),
            new Student(102,"Lashu","CSE"),
            new Student(103,"ilakki","ECE")
            ));

    public List<Student> getStudents(){
        return students;
    }

    public Student getstubyid(int stuid) {
         for(Student student : students){
            if(student.getStuId()==stuid) {
                return student;
            }
        }
        return new Student(100,"Not Found","Nill");
    }

    public void addstudent(Student stu){
         students.add(stu);
    }

    public void updatestudent(Student stus) {
        int index=0;
        for (int i = 1; i < students.size(); i++) {
            if(students.get(i).getStuId()==stus.getStuId()){
                index = i;
            }
        }
        students.set(index,stus);
    }

    public void deletestu(int studs) {
        int index=0;
        for (int i = 1; i < students.size(); i++) {
            if(students.get(i).getStuId()==studs){
                index = i;
            }
        }
        students.remove(index);
    }
}
