package dev.patika.fifthhomeworkozanclk.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {

    @ApiModelProperty(hidden = true)
    private long id;

    @ApiModelProperty(example = "Science")
    private String courseName;

    @ApiModelProperty(example = "Sci-1")
    private String courseCode;

    @ApiModelProperty()
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private int courseCredit;

    @ApiModelProperty(example = "Please enter instructor id")
    private Long instructorId;



}
