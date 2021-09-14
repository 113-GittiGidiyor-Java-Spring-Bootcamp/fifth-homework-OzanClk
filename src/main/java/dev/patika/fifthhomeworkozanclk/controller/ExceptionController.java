package dev.patika.fifthhomeworkozanclk.controller;


import dev.patika.fifthhomeworkapplication.entity.ApplicationErrorsResponseEntity;
import dev.patika.fifthhomeworkapplication.servis.ExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ExceptionController {

    @Autowired
    ExceptionService exceptionService;

    @GetMapping("/get-logs-by-date/{startDate}/{endDate}")
    public ResponseEntity<List<ApplicationErrorsResponseEntity>> getLogsByDate(@PathVariable String startDate, @PathVariable String endDate) {
        return new ResponseEntity<>(exceptionService.findLogByDateRange(startDate, endDate).get(), HttpStatus.OK);
    }

    @GetMapping("/get-logs-by-errorType/{errorType}")
    public ResponseEntity<List<ApplicationErrorsResponseEntity>> getLogsByErrorType(@PathVariable int errorType) {
        return new ResponseEntity<>(exceptionService.findLogByErrorType(errorType).get(), HttpStatus.OK);
    }


}
