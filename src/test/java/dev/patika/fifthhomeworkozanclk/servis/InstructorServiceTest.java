package dev.patika.fifthhomeworkozanclk.servis;

import dev.patika.fifthhomeworkozanclk.entity.Instructor;
import dev.patika.fifthhomeworkozanclk.entity.SalaryOperationEntity;
import dev.patika.fifthhomeworkozanclk.mapper.InstructorMapper;
import dev.patika.fifthhomeworkozanclk.repository.InstructorRepository;
import dev.patika.fifthhomeworkozanclk.repository.SalaryOperationRepository;
import jdk.internal.org.objectweb.asm.Type;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class InstructorServiceTest {

    @Mock
    InstructorRepository instructorRepository;

    @Mock
    SalaryOperationRepository salaryOperationRepository;

    @Mock
    InstructorMapper instructorMapper;

    @InjectMocks
    InstructorService instructorService;


    @Test
    void instructorSalaryAdjustment() {

        Instructor instructor = new Instructor();
        Optional<Instructor> expected = Optional.of(instructor);
        SalaryOperationEntity salaryOperation = new SalaryOperationEntity();
        Optional<SalaryOperationEntity> expected2 = Optional.of(salaryOperation);

        when(instructorRepository.findById(Mockito.anyLong())).thenReturn(expected);
        //when(instructorRepository.findPermanentInstructorSalary(Mockito.anyLong())).thenReturn();
        //when(salaryOperationRepository.save(Mockito.any())).thenReturn(expected2);


        Optional<Instructor> actual = instructorRepository.findById(Mockito.anyLong());
        //SalaryOperationEntity actual2 = salaryOperationRepository.save(Mockito.any());

        assertAll(
                () -> assertEquals(expected, actual)
                // () -> assertEquals(expected2, actual2)
        );


    }

    @Test
    void getSalaryAdjustmentWithInstructorId() {

        SalaryOperationEntity expected = new SalaryOperationEntity();

        when(salaryOperationRepository.findByInstructorId(Mockito.anyLong())).thenReturn(expected);


        SalaryOperationEntity actual = salaryOperationRepository.findByInstructorId(Mockito.anyLong());

        assertEquals(expected, actual);


    }

    @Test
    void getSalaryAdjustmentWithDateRange() {

        List<SalaryOperationEntity> salaryOperationEntityList = new ArrayList<>();
        Optional<List<SalaryOperationEntity>> expected = Optional.of(salaryOperationEntityList);


        when(salaryOperationRepository.findSalaryAdjustmentByDateRange(Mockito.anyString(), Mockito.anyString())).thenReturn(expected);


        Optional<List<SalaryOperationEntity>> actual = salaryOperationRepository.findSalaryAdjustmentByDateRange(Mockito.anyString(), Mockito.anyString());

        assertEquals(expected, actual);

    }
}