package dev.patika.fifthhomeworkozanclk.mapper;


import dev.patika.fifthhomeworkozanclk.dto.InstructorDTO;
import dev.patika.fifthhomeworkozanclk.entity.Instructor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class InstructorMapper {

    public abstract Instructor mappingFromInstructorDTOtoInstructor(InstructorDTO instructorDTO);

    public abstract InstructorDTO mappingFromInstructortoInstructorDTO(Instructor instructor);


}
