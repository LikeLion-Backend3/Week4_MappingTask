package springboot.mappingtask.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.mappingtask.data.entity.Student;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByNickname(String nickname);
}
