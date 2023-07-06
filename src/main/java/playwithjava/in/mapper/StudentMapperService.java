package playwithjava.in.mapper;

import playwithjava.in.bean.request.StudentRequest;
import playwithjava.in.bean.response.StudentResponse;
import playwithjava.in.entity.StudentEntity;

public interface StudentMapperService {

    StudentEntity mapStudentReqToEntity(StudentRequest request);
    StudentResponse mapStudentEntityToResponse(StudentEntity request);
}
