package dev.patika.fifthhomeworkozanclk.controller;


import dev.patika.fifthhomeworkozanclk.dto.InstructorDTO;
import dev.patika.fifthhomeworkozanclk.entity.Instructor;
import dev.patika.fifthhomeworkozanclk.entity.SalaryOperationEntity;
import dev.patika.fifthhomeworkozanclk.servis.InstructorService;
import dev.patika.fifthhomeworkozanclk.util.ClientRequestInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @Autowired
    private ClientRequestInfo clientRequestInfo;


    @PostMapping("/save-instructors")
    public ResponseEntity<Instructor> instructorSave(@RequestBody InstructorDTO instructorsDTO) {
        return new ResponseEntity<>(instructorService.save(instructorsDTO).get(), HttpStatus.OK);
    }

    @GetMapping("/get-instructors")
    public ResponseEntity<Iterable<Instructor>> instructorsFindAll() {
        return new ResponseEntity<>(instructorService.findByAll(), HttpStatus.OK);
    }

    @GetMapping("/get-instructors/{id}")
    public ResponseEntity<Optional<Instructor>> instructorFindById(@PathVariable int id) {
        return new ResponseEntity<>(instructorService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/update-instructors")
    public ResponseEntity instructorUpdate(@RequestBody InstructorDTO instructorDTO) {

        Optional<Instructor> tempStudent = instructorService.findById(instructorDTO.getId());

        if (tempStudent.isPresent()) {
            return new ResponseEntity<>(instructorService.update(instructorDTO), HttpStatus.OK);
        } else {
            return new ResponseEntity("Not Found", HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping("/delete-instructors/{id}")
    public ResponseEntity<String> instructorDeleteById(@PathVariable int id) {

        instructorService.deleteById(id);
        return new ResponseEntity<>("Instructor with id number  " + id + " has been deleted", HttpStatus.OK);

    }

    @PostMapping("/instructor-salary-adjustment/{instructorId}")
    public ResponseEntity<Optional<SalaryOperationEntity>> instructorSalaryAdjustment(HttpServletRequest request, HttpServletResponse response,
                                                                                      @PathVariable long instructorId,
                                                                                      @RequestParam char operationType, @RequestParam double adjustmentPercentage) {

        Optional<SalaryOperationEntity> salaryOperationResult = instructorService.instructorSalaryAdjustment(request, response, instructorId, operationType, adjustmentPercentage);

        return new ResponseEntity<>(salaryOperationResult, HttpStatus.OK);

    }


    @GetMapping("/get-salary-adjustment-with-instructorId/{instructorId}")
    public ResponseEntity<SalaryOperationEntity> getSalaryAdjustmentWithInstructorId(@PathVariable long instructorId) {
        return new ResponseEntity<>(instructorService.getSalaryAdjustmentWithInstructorId(instructorId), HttpStatus.OK);
    }

    @GetMapping("/get-salary-adjustment-with-date-range/{startDate}/{endDate}")
    public ResponseEntity<Optional<List<SalaryOperationEntity>>> getSalaryAdjustmentWithDateRange(@PathVariable String startDate, @PathVariable String endDate) {
        return new ResponseEntity<>(instructorService.getSalaryAdjustmentWithDateRange(startDate, endDate), HttpStatus.OK);
    }


}
