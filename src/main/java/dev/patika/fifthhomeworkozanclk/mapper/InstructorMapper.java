package dev.patika.fifthhomeworkozanclk.mapper;


import dev.patika.fifthhomeworkapplication.dto.InstructorDTO;
import dev.patika.fifthhomeworkapplication.entity.Instructor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class InstructorMapper {

    public abstract Instructor mappingFromInstructorDTOtoInstructor(InstructorDTO instructorDTO);

    public abstract InstructorDTO mappingFromInstructortoInstructorDTO(Instructor instructor);


}
