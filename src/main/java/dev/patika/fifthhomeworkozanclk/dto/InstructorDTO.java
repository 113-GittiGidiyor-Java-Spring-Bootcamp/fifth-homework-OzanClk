package dev.patika.fifthhomeworkozanclk.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstructorDTO {

    @ApiModelProperty(hidden = true)
    private long id;

    @ApiModelProperty(example = "VisitingResearcher")
    private String type;

    @ApiModelProperty(example = "Mustafa")
    private String instructorName;

    @ApiModelProperty(example = "Istanbul")
    private String address;

    @ApiModelProperty(example = "5554443312")
    private String phoneNumber;

    @ApiModelProperty(example = "200")
    private double salary;


}
