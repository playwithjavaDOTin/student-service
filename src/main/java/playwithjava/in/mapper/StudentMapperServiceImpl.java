package playwithjava.in.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import playwithjava.in.bean.request.StudentRequest;
import playwithjava.in.bean.response.StudentResponse;
import playwithjava.in.entity.StudentEntity;


@Service
public class StudentMapperServiceImpl implements StudentMapperService{

    @Autowired
    ModelMapper mapper;

    @Override
    public StudentEntity mapStudentReqToEntity(StudentRequest request) {
        StudentEntity studentEntity=StudentEntity.builder().build();
        mapper.map(request,studentEntity);
        return studentEntity;
    }

    @Override
    public StudentResponse mapStudentEntityToResponse(StudentEntity entity) {
        StudentResponse response=StudentResponse.builder().build();
        mapper.map(entity,response);
        return response;
    }
}
