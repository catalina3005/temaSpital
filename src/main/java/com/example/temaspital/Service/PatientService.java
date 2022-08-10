package com.example.temaspital.Service;
import com.example.temaspital.Repository.VisitRepository;
import lombok.RequiredArgsConstructor;
import com.example.temaspital.Model.Doctor;
import com.example.temaspital.Model.Patient;
import com.example.temaspital.Model.Specialty;
import com.example.temaspital.Model.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.temaspital.Repository.PatientRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    @Autowired
    final PatientRepository patientRepository;
    final VisitRepository visitRepository;

    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    public List<Patient> getAllByDoctor(Doctor doctor){
        return patientRepository.getAllByDoctor(doctor);
    }

    public Patient getById(Integer patientId){
        return patientRepository.getById(patientId);
    }

    public Patient getByCnp(String cnp){
        return patientRepository.getPatientByCnp(cnp);
    }

    public List<Visit> getAllVisitsByCnpAndSpecialty(String cnp, Specialty specialty){
        return visitRepository.getAllByPatient_CnpAndDoctor_Specialty(cnp,specialty);
    }

    public void savePatient(Patient patient){
        patientRepository.save(patient);
    }


}