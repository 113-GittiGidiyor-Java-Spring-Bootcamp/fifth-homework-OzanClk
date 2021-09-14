package dev.patika.fifthhomeworkozanclk.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class SalaryOperationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long instructorId;
    private double previousSalary;
    private double salaryAfterUpdate;
    private double salaryUpdatePercentage;
    private String clientIpAdress;
    private String clientUrl;
    private String sessionActivityId;
    private LocalDate requestDate;

}
