package springboot.mappingtask.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.mappingtask.data.entity.Teacher;

import java.util.Optional;

//상속
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    Optional<Teacher> findByTeacherName(String name);
}
