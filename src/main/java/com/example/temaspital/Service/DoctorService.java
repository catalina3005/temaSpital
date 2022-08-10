package com.example.temaspital.Service;


import com.example.temaspital.Exceptions.NoDoctorException;
import com.example.temaspital.Repository.DoctorRepository;
import com.example.temaspital.Repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import com.example.temaspital.Model.Doctor;
import com.example.temaspital.Model.Patient;
import com.example.temaspital.Model.Specialty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {


    @Autowired
    final DoctorRepository doctorRepository;
    @Autowired
    final PatientRepository patientRepository;
    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }

    public void addPatient(Integer doctorId, Integer patientId)throws NoDoctorException{

        Doctor d = doctorRepository.getById(doctorId);
        if(d == null) {
            throw new NoDoctorException();
        }else{
            Patient p = patientRepository.getById(patientId);
            if(p!= null){
                d.setPatient(p);
            }
        }


    }

    public List<Doctor> getAllBySpecialty(Specialty specialty){
        return getAllBySpecialty(specialty);
    }

    public void saveDoctor(Doctor doctor){
        doctorRepository.save(doctor);
    }





}