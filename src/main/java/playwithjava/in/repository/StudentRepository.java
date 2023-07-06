package playwithjava.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import playwithjava.in.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
}
