package dev.patika.fifthhomeworkozanclk.mapper;


import dev.patika.fifthhomeworkapplication.dto.CourseDTO;
import dev.patika.fifthhomeworkapplication.entity.Course;
import dev.patika.fifthhomeworkapplication.servis.CourseService;
import dev.patika.fifthhomeworkapplication.servis.InstructorService;
import dev.patika.fifthhomeworkapplication.servis.StudentService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class CourseMapper {


    @Autowired
    public CourseService courseService;

    @Autowired
    public InstructorService instructorService;

    @Autowired
    public StudentService studentService;


    @Mapping(target = "instructor", expression = "java(instructorService.findByIdForMapper(courseDTO.getInstructorId()))")
    //@Mapping(target = "students", expression = "java(studentService.studentsFindWithCourseId(courseDTO.getStudentsCourseId()))")
    public abstract Course mappingFromCourseDTOtoCourse(CourseDTO courseDTO);


}
