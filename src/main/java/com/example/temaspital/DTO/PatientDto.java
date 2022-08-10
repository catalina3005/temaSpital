package com.example.temaspital.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.temaspital.Model.Patient;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientDto {
    String cnp;
    String doctorName;

    public PatientDto(Patient patient) {
        this.cnp = patient.getCnp();
        this.doctorName = patient.getDoctor().getName();
    }
}