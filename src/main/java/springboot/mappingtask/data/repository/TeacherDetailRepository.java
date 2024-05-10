package springboot.mappingtask.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.mappingtask.data.entity.TeacherDetail;

public interface TeacherDetailRepository extends JpaRepository<TeacherDetail, Long> {
}
