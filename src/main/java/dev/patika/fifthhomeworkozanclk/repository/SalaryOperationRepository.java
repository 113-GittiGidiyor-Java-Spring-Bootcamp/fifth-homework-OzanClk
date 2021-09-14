package dev.patika.fifthhomeworkozanclk.repository;

import dev.patika.fifthhomeworkozanclk.entity.SalaryOperationEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface SalaryOperationRepository extends CrudRepository<SalaryOperationEntity, Long> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE permanent_instructor pi INNER JOIN instructor i ON pi.id = ?1 SET fixed_salary = ?2", nativeQuery = true)
    void updatePermanentSalary(long instructorId, double fixedSalary);

    @Transactional
    @Modifying
    @Query(value = "UPDATE visiting_researcher vi INNER JOIN instructor i ON vi.id = ?1 SET hourly_salary = ?2", nativeQuery = true)
    void updateVisitingSalary(long instructorId, double fixedSalary);

}
