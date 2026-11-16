package com.example.StudentMapper.mapper;

import com.example.StudentMapper.dto.StudentDto;
import com.example.StudentMapper.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentDto toDto(Student student);

    Student toEntity(StudentDto studentDto);
}
