package MongoDBexample.Controller;

import MongoDBexample.Entity.Student;
import MongoDBexample.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student)
    {
        Student saveStudent = this.studentRepository.save(student);
        return ResponseEntity.ok(saveStudent);
    }

    @GetMapping("/")
    public ResponseEntity<?> getStudent(){
        return ResponseEntity.ok(this.studentRepository.findAll());
    }

}
