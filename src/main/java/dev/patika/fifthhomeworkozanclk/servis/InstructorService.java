/**
 * This service class performs the operations for the instructor.
 *
 * @author ozancelik
 */

package dev.patika.fifthhomeworkozanclk.servis;


import com.fasterxml.jackson.databind.ObjectMapper;
import dev.patika.fifthhomeworkozanclk.dto.InstructorDTO;
import dev.patika.fifthhomeworkozanclk.entity.Instructor;
import dev.patika.fifthhomeworkozanclk.entity.PermanentInstructor;
import dev.patika.fifthhomeworkozanclk.entity.SalaryOperationEntity;
import dev.patika.fifthhomeworkozanclk.entity.VisitingResearcher;
import dev.patika.fifthhomeworkozanclk.exceptions.InstructorIsAlreadyExistException;
import dev.patika.fifthhomeworkozanclk.exceptions.InstructorIsNotExist;
import dev.patika.fifthhomeworkozanclk.mapper.InstructorMapper;
import dev.patika.fifthhomeworkozanclk.repository.InstructorRepository;
import dev.patika.fifthhomeworkozanclk.repository.SalaryOperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class InstructorService implements BaseService<InstructorDTO> {

    @Autowired
    private InstructorRepository instructorRepository;

    @Autowired
    private SalaryOperationRepository salaryOperationRepository;


    @Autowired
    private InstructorMapper instructorMapper;

    public Instructor findByIdForMapper(Long id) {

        return instructorRepository.findById(id).orElse(null);
    }


    @Override
    public Optional<Instructor> save(InstructorDTO instructorDTO) {

        if (instructorRepository.findInstructorsWithTheSamePhoneNumber(instructorDTO.getPhoneNumber())) {
            throw new InstructorIsAlreadyExistException("Found more than 1 Instructor with this number");
        }

        // Serializing the InstructorDTO object for save processing
        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> props = mapper.convertValue(instructorDTO, Map.class);
        Instructor instructor = mapper.convertValue(props, Instructor.class);

        return Optional.of(instructorRepository.save(instructor));
    }

    @Override
    public Optional<Instructor> findById(long id) {
        return Optional.of(instructorRepository.findById(id).orElse(null));
    }

    @Override
    public Optional<Instructor> update(InstructorDTO instructorDTO) {
        Instructor instructor = instructorMapper.mappingFromInstructorDTOtoInstructor(instructorDTO);
        return Optional.of(instructorRepository.save(instructor));
    }

    @Override
    public Iterable<Instructor> findByAll() {
        return instructorRepository.findAll();
    }

    @Override
    public void deleteById(long id) {
        instructorRepository.deleteById(id);
    }

    public Optional<SalaryOperationEntity> instructorSalaryAdjustment(HttpServletRequest request, HttpServletResponse response,
                                                                      long instructorId,
                                                                      char operationType,
                                                                      double adjustmentPercentage) {
        Instructor instructor = instructorRepository.findById(instructorId).get();
        SalaryOperationEntity salaryOperationEntity = null;

        if (instructor != null) {

            if (instructor instanceof PermanentInstructor) {

                double fixedSalary = instructorRepository.findPermanentInstructorSalary(instructorId);

                double salaryCalculated = salaryCalculater(fixedSalary, adjustmentPercentage, operationType);

                salaryOperationRepository.updatePermanentSalary(instructorId, salaryCalculated);


                salaryOperationEntity = SalaryOperationEntity.builder().instructorId(instructorId).previousSalary(fixedSalary)
                                                                        .salaryAfterUpdate(salaryCalculated)
                                                                        .salaryUpdatePercentage(adjustmentPercentage)
                                                                        .clientIpAdress(request.getRemoteAddr())
                                                                        .clientUrl(request.getRequestURI())
                                                                        .sessionActivityId(request.getSession().getId())
                                                                        .requestDate(LocalDate.now()).build();

                salaryOperationRepository.save(salaryOperationEntity);

                return Optional.of(salaryOperationEntity);


            } else if (instructor instanceof VisitingResearcher) {

                double hourlySalary = instructorRepository.findVisitingResearcherSalary(instructorId);

                double salaryCalculated = salaryCalculater(hourlySalary, adjustmentPercentage, operationType);

                salaryOperationRepository.updateVisitingSalary(instructorId, salaryCalculated);


                salaryOperationEntity = SalaryOperationEntity.builder()
                        .instructorId(instructorId)
                        .previousSalary(hourlySalary)
                        .salaryAfterUpdate(salaryCalculated)
                        .salaryUpdatePercentage(adjustmentPercentage)
                        .clientIpAdress(request.getRemoteAddr())
                        .clientUrl(request.getRequestURI())
                        .sessionActivityId(request.getSession().getId())
                        .requestDate(LocalDate.now()).build();

                salaryOperationRepository.save(salaryOperationEntity);

                return Optional.of(salaryOperationEntity);
            }


        } else {
            throw new InstructorIsNotExist("No Instructor found for this" + instructorId + "id");
        }

        return Optional.of(salaryOperationEntity);

    }

    private double salaryCalculater(double salary, double adjustmentPercentage, char operationType) {

        if (operationType == '+') {
            return salary += ((salary * adjustmentPercentage) / 100);
        } else if (operationType == '-') {

            double resultSalary = salary - ((salary * adjustmentPercentage) / 100);

            if (resultSalary < 0)
                return salary;

            return resultSalary;
        } else {
            return salary;
        }
    }


    public SalaryOperationEntity getSalaryAdjustmentWithInstructorId(long instructorId) {
        return salaryOperationRepository.findByInstructorId(instructorId);
    }

    public Optional<List<SalaryOperationEntity>> getSalaryAdjustmentWithDateRange(String startDate, String endDate) {
        return salaryOperationRepository.findSalaryAdjustmentByDateRange(startDate, endDate);
    }
}
