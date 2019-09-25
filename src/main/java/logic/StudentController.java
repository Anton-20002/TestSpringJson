package logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

  @Autowired
  private StudentService studentService;


  @GetMapping("/all")
  public ResponseEntity<List<StudentEntity>> getAllStudents() {
    return new ResponseEntity<>(studentService.getAllStudents()
            , HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<StudentEntity> getStudentById(@PathVariable("id") Integer id) {
    Optional<StudentEntity> student = studentService.getById(id);
    if(student.isPresent())
      return new ResponseEntity<>(student.get(), HttpStatus.OK);
    else
      throw new ResponseStatusException(HttpStatus.NOT_FOUND
              , "No student found!");
  }


}
