package playwithjava.in.service;

import org.springframework.stereotype.Service;
import playwithjava.in.bean.request.StudentRequest;
import playwithjava.in.bean.response.StudentResponse;

import java.util.List;

@Service
public interface StudentService {

    public StudentResponse addStudent(StudentRequest request);
    public StudentResponse updateStudent(StudentRequest request);
    public StudentResponse getStudent(Long sid);
    public List<StudentResponse> getAllStudent();
    public void deleteStudent(Long sid);
}
