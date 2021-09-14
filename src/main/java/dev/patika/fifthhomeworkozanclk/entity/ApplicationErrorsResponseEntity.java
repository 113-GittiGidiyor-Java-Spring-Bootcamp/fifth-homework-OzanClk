package dev.patika.fifthhomeworkozanclk.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationErrorsResponseEntity extends BaseEntity{


    private String message;
    private int statusCode;


}
