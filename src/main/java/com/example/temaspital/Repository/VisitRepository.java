package com.example.temaspital.Repository;

import com.example.temaspital.Model.Specialty;
import com.example.temaspital.Model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface VisitRepository extends JpaRepository<Visit, Integer> {

    List<Visit> findAll();
    List<Visit> getAllByPatient_CnpAndDoctor_Specialty(String cnp, Specialty specialty);

}