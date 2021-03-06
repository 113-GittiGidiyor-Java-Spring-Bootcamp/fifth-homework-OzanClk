package dev.patika.fifthhomeworkozanclk.mapper;


import dev.patika.fifthhomeworkozanclk.dto.StudentDTO;
import dev.patika.fifthhomeworkozanclk.entity.Student;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public abstract class StudentMapper {

    public abstract Student mappingFromStudentDTOtoStudent(StudentDTO studentDTO);

}
