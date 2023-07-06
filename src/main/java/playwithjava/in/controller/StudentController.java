package playwithjava.in.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import playwithjava.in.bean.request.StudentRequest;
import playwithjava.in.bean.response.StudentResponse;
import playwithjava.in.constant.StudentServiceConstants;
import playwithjava.in.service.StudentService;

import java.util.List;

@RestController
@RequestMapping(StudentServiceConstants.STUDENT_CONTROLLER_ENDPOINT)
@Slf4j
public class StudentController {

    @Autowired
    StudentService studentService;


    @PostMapping(StudentServiceConstants.STUDENT_ADD_STUDENT_ENDPOINT)
    public ResponseEntity<StudentResponse> addStudent(@RequestBody StudentRequest request){
        log.info("## Student Controller :: add student");
        StudentResponse studentResponse=studentService.addStudent(request);

        return new ResponseEntity(studentResponse,HttpStatus.OK);
    }

    @GetMapping(StudentServiceConstants.STUDENT_GET_STUDENT_ENDPOINT+"/{sid}")
    public ResponseEntity<StudentResponse> getStudentById(@PathVariable Long sid){
        log.info("## Student Controller :: add student");
        StudentResponse studentResponse=studentService.getStudent(sid);

        return new ResponseEntity(studentResponse,HttpStatus.OK);
    }

    @GetMapping(StudentServiceConstants.STUDENT_GET_STUDENT_ENDPOINT)
    public ResponseEntity<List<StudentResponse>> getAllStudent(){
        log.info("## Student Controller :: add student");
        List<StudentResponse> studentResponse=studentService.getAllStudent();

        return new ResponseEntity(studentResponse,HttpStatus.OK);
    }

}
