package springboot.mappingtask.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.mappingtask.data.entity.Books;

import java.util.Optional;

public interface BooksRepository extends JpaRepository<Books, Long> {
    Optional<Books> findByBooksTitle(String title);
}
