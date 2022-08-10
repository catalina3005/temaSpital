package com.example.temaspital.Mapper;

import com.example.temaspital.DTO.DoctorDto;
import com.example.temaspital.Model.Doctor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DoctorMapper {

    DoctorDto toDoctorDto(Doctor doctor);

}
