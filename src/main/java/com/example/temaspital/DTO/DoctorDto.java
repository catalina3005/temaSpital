package com.example.temaspital.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.temaspital.Model.Doctor;
import com.example.temaspital.Model.Specialty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDto {
    String name;
    Specialty specialty;

    public DoctorDto(Doctor doctor){
        this.name = doctor.getName();
        this.specialty = doctor.getSpecialty();
    }
}