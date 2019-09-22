package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import orm.StudentEntity;
import orm.StudentRepository;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class MainController {

    @Autowired
    StudentRepository studentRepository;

    /*@GetMapping("/students")
    public String getStudents()
    {
        List<StudentEntity> list = studentRepository.findAll();
        System.out.println(list);
        System.out.println("getStudents work");
        return list.toString();
    }*/
    /*
    @GetMapping("/students/{id}")
    public String getStudents(@PathVariable int id)
    {
        Optional<StudentEntity> entity = studentRepository.findById(id);
        return "Detail of student "+id+" will be displayed here\n\n\n"+entity.toString();
    }*/
    @GetMapping("/students")
    public String getStudents()
    {
        System.out.println(studentRepository.findAll());
        return studentRepository.findAll().toString();
    }
    @GetMapping("/students/{id}")
    public Optional<StudentEntity> getStudents(@PathVariable int id)
    {
        Optional<StudentEntity> entity = studentRepository.findById(id);
        return entity;
    }
    @DeleteMapping("/students/{id}")
    public boolean deleteStudent(@PathVariable int id)
    {
        studentRepository.deleteById(id);
        return true;
    }
    @PostMapping("/student")
    public StudentEntity createStudent(@PathVariable StudentEntity studentEntity)
    {
        return studentRepository.save(studentEntity);
    }
    @PutMapping("/student")
    public StudentEntity updateStudent(@PathVariable StudentEntity studentEntity)
    {
        return studentRepository.save(studentEntity);
    }
}
