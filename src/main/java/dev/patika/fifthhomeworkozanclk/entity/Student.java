package dev.patika.fifthhomeworkozanclk.entity;


import dev.patika.fifthhomeworkapplication.entity.enumeration.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student extends BaseEntity {

    private String name;
    private LocalDate birthDate;
    private String address;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToMany(mappedBy = "students",fetch = FetchType.LAZY, targetEntity = Course.class)
    private List<Course> courses;



}
