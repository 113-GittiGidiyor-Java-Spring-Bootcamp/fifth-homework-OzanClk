# School Management System

![hm05](https://user-images.githubusercontent.com/45206582/132606840-bcc89ab7-37f4-4bbd-a950-227b838b0b3c.PNG)



## About The Project

Within the scope of the project, teacher and student transactions for a course were carried out. These processes are course-student-instructor saving, updating, deleting, searching.

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/Entity%20Relationship%20Diagram.md" rel="some text">Entity Relationship Diagram</a>



## Built With

Technologies and frameworks used in the project

[![Foo](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://docs.oracle.com/javase/8/docs/) Java 8

[![Foo](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/) Spring Boot 2.5.4

[![Foo](https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/docs/3.8.2/release-notes.html) Maven 3.8.2

[![Foo](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white)](https://dev.mysql.com/doc/) MySQL 8.0

[![Foo](https://img.shields.io/badge/Junit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)](https://junit.org/junit5/docs/current/user-guide/)  JUnit




## Prerequisites

- Oracle JDK 8 and JRE 8 
- MySQL Server  8.0



## Installation

- Clone the repo

```
git clone https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk.git
```



# List of REST API's

 Rest API's implemented within the scope of the project.

#### Courses API's

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/Course-Delete.md" rel="some text">DELETE localhost:8080/api/delete-courses/id</a>

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/Course-GET.md" rel="some text">GET localhost:8080/api/get-courses"</a>

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/GET-COURSE-ID.md" rel="some text">GET localhost:8080/api/get-courses/id</a>

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/Student-Course-Save.md" rel="some text">POST localhost:8080/api/students-save-in-the-course/coursesId/studentsId</a>

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/save-course.md" rel="some text">POST localhost:8080/api/save-courses </a>

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/Course-Update.md" rel="some text">PUT localhost:8080/api/update-courses</a>

#### Instructors API's

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/InstructorDelete.md" rel="some text">DELETE localhost:8080/api/delete-instructors/id</a>

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/Get-Instrcutors.md" rel="some text">GETlocalhost:8080/api/get-instructors</a>

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/Get-Instrcutors.md" rel="some text">GET localhost:8080/api/get-instructors/id</a>

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/Adjustment.md" rel="some text">POST localhost:8080/api/instructor-salary-adjustment/ instructorId</a>

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/adjustment-with-date-range.md" rel="some text">GET localhost:8080/api/get-salary-adjustment-with-date-range /startDate /endDate</a>

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/adjustment-with-instructor-id.md" rel="some text">GET localhost:8080/api/get-salary-adjustment-with-instructorId /instructorId </a>

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/Save-Instructor.md" rel="some text">POST localhost:8080/api/save-instructors</a>

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/UpdateInstructor.md" rel="some text">PUT localhost:8080/api/update-instructors</a>

#### Students API's

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/delete-student.md" rel="some text">DELETE localhost:8080/api/delete-students /id</a>

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/get-studentt.md" rel="some text">GET localhost:8080/api/get-students </a>

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/get-student-with-id.md" rel="some text">GET localhost:8080/api/get-students /id</a>

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/save-student.md" rel="some text">POST localhost:8080/api/save-students </a>

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/update-student.md" rel="some text">PUT localhost:8080/api/update-students </a>

#### Exceptions  API's

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/ExceptionsWithDate.md" rel="some text">GET localhost:8080/api/get-logs-by-date/startDate/endDate </a>

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/ErrorType.md" rel="some text">GET localhost:8080/api/get-logs-by-errorType/errorType</a>



#### JUnit Test Examples

<a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fifth-homework-OzanClk/blob/5af348c2d030acaed054007d25088fdf44b551ca/ReadMeFiles/UnitTest.md" rel="some text">This is the unit test cases added within the scope of the project.</a>



## License

Distributed under the MIT License. See `LICENSE` for more information.



## Contact


![Foo](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)   --  ozancelikinfo@gmail.com

[![Foo](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/ozan-%C3%A7elik/)

[![Foo](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/OzanClk)


