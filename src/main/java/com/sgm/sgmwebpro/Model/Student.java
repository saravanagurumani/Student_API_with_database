package com.sgm.sgmwebpro.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;


@Component
@Entity
public class Student {

    @Id
    private int stuId;
    private String stuName;
    private String stuDept;

    public Student() {
    }

    public Student(int stuId, String stuName, String stuDept) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuDept = stuDept;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuDept() {
        return stuDept;
    }

    public void setStuDept(String stuDept) {
        this.stuDept = stuDept;
    }
}
