package com.example.temaspital.DTO;
import com.example.temaspital.Model.Specialty;
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
    Specialty specialty;

    public PatientDto(Patient patient) {
        this.cnp = patient.getCnp();
        this.doctorName = patient.getDoctor().getName();

    }
}