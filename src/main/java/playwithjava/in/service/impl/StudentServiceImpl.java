package playwithjava.in.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import playwithjava.in.bean.request.StudentRequest;
import playwithjava.in.bean.response.StudentResponse;
import playwithjava.in.entity.StudentEntity;
import playwithjava.in.mapper.StudentMapperService;
import playwithjava.in.repository.StudentRepository;
import playwithjava.in.service.StudentService;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentMapperService mapperService;

    @Override
    public StudentResponse addStudent(StudentRequest request) {
        StudentEntity studentEntity=mapperService.mapStudentReqToEntity(request);
        StudentEntity entity= studentRepository.save(studentEntity);
        StudentResponse studentResponse=mapperService.mapStudentEntityToResponse(entity);
        return studentResponse;
    }

    @Override
    public StudentResponse updateStudent(StudentRequest request) {
        return null;
    }

    @Override
    public StudentResponse getStudent(Long sid) {
        Optional<StudentEntity> studentEntity=studentRepository.findById(sid);
        return mapperService.mapStudentEntityToResponse(studentEntity.get());
    }

    @Override
    public List<StudentResponse> getAllStudent() {

        List<StudentEntity> studentEntities= studentRepository.findAll();

        Function<StudentEntity,StudentResponse> convert=(x)->mapperService.mapStudentEntityToResponse(x);
        List<StudentResponse> responses=studentEntities.stream()
                .map(convert)
                .collect(Collectors.toList());
        return responses;
    }

    @Override
    public void deleteStudent(Long sid) {
        studentRepository.deleteById(sid);
    }
}
