package dev.patika.fifthhomeworkozanclk.mapper;


import dev.patika.fifthhomeworkapplication.dto.StudentDTO;
import dev.patika.fifthhomeworkapplication.entity.Student;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public abstract class StudentMapper {

    public abstract Student mappingFromStudentDTOtoStudent(StudentDTO studentDTO);

}
