## JUnit Controller Layer Example Test Cases

```java
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
```



## JUnit Service Layer Example Test Cases

```java
@ExtendWith(MockitoExtension.class)
class InstructorServiceTest {
@Mock
InstructorRepository instructorRepository;

@Mock
SalaryOperationRepository salaryOperationRepository;

@Mock
InstructorMapper instructorMapper;

@InjectMocks
InstructorService instructorService;
@Test
void instructorSalaryAdjustment() {

    Instructor instructor = new Instructor();
    Optional<Instructor> expected = Optional.of(instructor);
    SalaryOperationEntity salaryOperation = new SalaryOperationEntity();
    Optional<SalaryOperationEntity> expected2 = Optional.of(salaryOperation);

    when(instructorRepository.findById(Mockito.anyLong())).thenReturn(expected);
    //when(instructorRepository.findPermanentInstructorSalary(Mockito.anyLong())).thenReturn();
    //when(salaryOperationRepository.save(Mockito.any())).thenReturn(expected2);
    Optional<Instructor> actual = instructorRepository.findById(Mockito.anyLong());
    //SalaryOperationEntity actual2 = salaryOperationRepository.save(Mockito.any());

    assertAll(
            () -> assertEquals(expected, actual)
            // () -> assertEquals(expected2, actual2)
    );
    @Test
void getSalaryAdjustmentWithInstructorId() {

    SalaryOperationEntity expected = new SalaryOperationEntity();

    when(salaryOperationRepository.findByInstructorId(Mockito.anyLong())).thenReturn(expected);
     SalaryOperationEntity actual = salaryOperationRepository.findByInstructorId(Mockito.anyLong());

    assertEquals(expected, actual);   
    
    @Test
void getSalaryAdjustmentWithDateRange() {

    List<SalaryOperationEntity> salaryOperationEntityList = new ArrayList<>();
    Optional<List<SalaryOperationEntity>> expected = Optional.of(salaryOperationEntityList);
    
     when(salaryOperationRepository.findSalaryAdjustmentByDateRange(Mockito.anyString(), Mockito.anyString())).thenReturn(expected);
 
      Optional<List<SalaryOperationEntity>> actual = salaryOperationRepository.findSalaryAdjustmentByDateRange(Mockito.anyString(), Mockito.anyString());

    assertEquals(expected, actual);

}
    
    
```
