package dev.patika.fifthhomeworkozanclk.repository;


import dev.patika.fifthhomeworkapplication.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {

    @Query("SELECT CASE WHEN COUNT(i) > 0 THEN TRUE ELSE FALSE END FROM Instructor i WHERE i.phoneNumber = ?1")
    boolean findInstructorsWithTheSamePhoneNumber(String phoneNumber);

    @Query(value = "SELECT fixed_salary FROM permanent_instructor pi INNER JOIN instructor i ON pi.id = ?1 GROUP BY fixed_salary", nativeQuery = true)
    double findPermanentInstructorSalary(long instructorId);

    @Query(value = "SELECT hourly_salary FROM visiting_researcher vi INNER JOIN instructor i ON vi.id = ?1 GROUP BY hourly_salary;", nativeQuery = true)
    double findVisitingResearcherSalary(long instructorId);




}
