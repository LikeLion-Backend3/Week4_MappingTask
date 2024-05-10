package springboot.mappingtask.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.mappingtask.data.entity.Student;
import springboot.mappingtask.data.entity.Student_a;

import java.util.Optional;

public interface Student_aRepository extends JpaRepository<Student_a, Long> {
}

