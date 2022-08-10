package com.example.temaspital.Repository;
import com.example.temaspital.DTO.PatientDto;
import com.example.temaspital.Model.Doctor;
import com.example.temaspital.Model.Patient;
import com.example.temaspital.Model.Specialty;
import com.example.temaspital.Model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Integer>
{
    List<Patient> findAll();
    Patient getPatientById(Integer id);

    List<Patient> getAllByDoctor(Doctor doctor);

    Patient getPatientByCnp(String cnp);

    Patient getById(Integer id);
    Patient getByCnp(String cnp);
    PatientDto findByCnp(String cnp);


}