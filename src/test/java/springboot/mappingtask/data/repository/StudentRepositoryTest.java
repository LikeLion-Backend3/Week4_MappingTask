package springboot.mappingtask.data.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springboot.mappingtask.data.entity.Student;
import springboot.mappingtask.data.entity.Teacher;

@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    StudentRepository studentRepository;

    @Test
    void relationshipTest1() {

        Student student = new Student();
        student.setName("김학생");
        student.setAge("15");
        student.setNickname("부엉이");
        student.setNumber("010-4546-2342");
        student.setPassword("부엉이123");

        studentRepository.save(student);

        Teacher teacher  = new Teacher();
        teacher.setName("홍선생");
        teacher.setGender("남성");
        teacher.setAge("34");
        teacher.setEmail("nightmare@gmail.com");
        teacher.setPhoneNum("010-5498-7962");
        teacher.setSubject("과학");
        teacher.setGrade(3);

        teacherRepository.save(teacher);

        System.out.println(
                "teacher : " + teacherRepository.findById(1L).orElseThrow(RuntimeException::new)
        );
        System.out.println("student : " + studentRepository.findById(1L).orElseThrow(RuntimeException::new).getName());
    }
}
