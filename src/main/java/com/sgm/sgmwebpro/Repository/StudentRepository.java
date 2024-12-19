package com.sgm.sgmwebpro.Repository;

import com.sgm.sgmwebpro.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
