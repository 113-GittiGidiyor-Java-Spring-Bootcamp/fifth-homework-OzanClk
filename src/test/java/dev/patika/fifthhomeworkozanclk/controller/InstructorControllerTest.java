package dev.patika.fifthhomeworkozanclk.controller;

import dev.patika.fifthhomeworkozanclk.entity.SalaryOperationEntity;
import dev.patika.fifthhomeworkozanclk.servis.InstructorService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;


@ExtendWith(MockitoExtension.class)
class InstructorControllerTest {

    @Mock
    InstructorService instructorService;

    @InjectMocks
    InstructorController instructorController;

    @Test
    void instructorSalaryAdjustment() {

        SalaryOperationEntity salaryOperationEntity = new SalaryOperationEntity();
        Optional<SalaryOperationEntity> expected = Optional.of(salaryOperationEntity);

        Mockito.when(instructorService.instructorSalaryAdjustment(Mockito.any(), Mockito.any(), Mockito.anyLong(), Mockito.anyChar(), Mockito.anyDouble())).thenReturn(expected);


        Optional<SalaryOperationEntity> actual = this.instructorController.instructorSalaryAdjustment(Mockito.any(), Mockito.any(), Mockito.anyLong(), Mockito.anyChar(), Mockito.anyDouble()).getBody();

        assertAll(
                () -> assertNotNull(actual),
                () -> assertEquals(expected, actual)
        );


    }

    @Test
    void getSalaryAdjustmentWithInstructorId() {

        SalaryOperationEntity expected = new SalaryOperationEntity();

        Mockito.when(instructorService.getSalaryAdjustmentWithInstructorId(Mockito.anyLong())).thenReturn(expected);

        SalaryOperationEntity actual = this.instructorController.getSalaryAdjustmentWithInstructorId(Mockito.anyLong()).getBody();


        assertEquals(expected, actual);

    }

    @Test
    void getSalaryAdjustmentWithDateRange() {

        List<SalaryOperationEntity> salaryOperationEntityList = new ArrayList<>();
        Optional<List<SalaryOperationEntity>> expected = Optional.of(salaryOperationEntityList);

        Mockito.when(instructorService.getSalaryAdjustmentWithDateRange(Mockito.anyString(), Mockito.anyString())).thenReturn(expected);

        Optional<List<SalaryOperationEntity>> actual = this.instructorController.getSalaryAdjustmentWithDateRange(Mockito.anyString(), Mockito.anyString()).getBody();


        assertEquals(expected, actual);

    }
}