package com.sgm.sgmwebpro.Controller;

import com.sgm.sgmwebpro.Model.Student;
import com.sgm.sgmwebpro.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService stu;

@GetMapping("/Students")
    public List<Student> getstudent(){
        return stu.getStudents();
    }

@GetMapping("/Students/{sid}")
    public Student getstudentbyid(@PathVariable int sid){
        return stu.getstubyid(sid);
    }

//@RequestMapping(method = RequestMethod.POST)
    @PostMapping("/Addstudent")
    public void addstudent(@RequestBody Student stud){
        stu.addstudent(stud);
    }

    @PutMapping("/Students")
    public void updatestudent(@RequestBody Student stus){
        stu.updatestudent(stus);
    }

    @DeleteMapping("/Students/{studid}")
    public void deletestudent(@PathVariable int studid){
        stu.deletestu(studid);
    }


}
