package com.example.temaspital.Controller;

import com.example.temaspital.Model.Patient;
import com.example.temaspital.Model.Specialty;
import com.example.temaspital.Model.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.temaspital.Service.PatientService;

import java.util.List;

@RestController
@RequestMapping("patients")
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping("/all")
    public List<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }

    @GetMapping("/cnp/{cnp}")
    public Patient getPatientByCnp(@PathVariable String cnp){
        return patientService.getByCnp(cnp);
    }

    @PostMapping("/addPatient")
    public void addPatient(@RequestBody Patient patient){
        patientService.savePatient(patient);
    }

    @GetMapping("/visits/{cnp}/{specialty}")
    public List<Visit> getAllVisitsByCnpAndSpecialty(@PathVariable String cnp, @PathVariable Specialty specialty){
        return patientService.getAllVisitsByCnpAndSpecialty(cnp,specialty);
    }





}
