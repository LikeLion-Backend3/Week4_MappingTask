package springboot.mappingtask.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.mappingtask.data.entity.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
    School findByName(String name);
}
