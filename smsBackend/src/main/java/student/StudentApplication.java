package student;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import student.domain.Gender;
import student.domain.Name;
import student.domain.Student;

import javax.imageio.spi.ServiceRegistry;
import java.util.Optional;


@EnableAspectJAutoProxy
@EnableJpaRepositories("orm")
@EnableAutoConfiguration
@EntityScan("orm")
@SpringBootApplication(scanBasePackages = {"student", "orm", "controller", "service"})
public class StudentApplication {
    public static void main(String args[])
    {
        SpringApplication.run(StudentApplication.class, args);
        System.out.println("Student Apllication Working atleast");
        /*Dummy Data*/
        /*for student 1*/
        Name name = new Name();
        name.setFirstName("Hitesh");
        name.setLastName(Optional.of("Munjal"));
        Student studentOne = new Student();
        studentOne.setRollNo(1710991325);
        studentOne.setName(name);
        studentOne.setGender(Gender.MALE);


        /*for student 2*/
        Name name2 = new Name();
        name.setFirstName("Kanika");
        name.setMiddleName(Optional.of("Kannu"));
        name.setLastName(Optional.of("Jindal"));
        Student studentTwo = new Student();
        studentTwo.setRollNo(1710991369);
        studentTwo.setName(name);
        studentTwo.setGender(Gender.FEMALE);



    }

}
