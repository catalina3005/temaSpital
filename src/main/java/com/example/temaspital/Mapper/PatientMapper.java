package com.example.temaspital.Mapper;

import com.example.temaspital.DTO.PatientDto;
import com.example.temaspital.Model.Patient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    PatientDto toPatientDto(Patient patient);
}