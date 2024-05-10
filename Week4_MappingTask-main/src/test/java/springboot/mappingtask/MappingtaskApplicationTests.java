package springboot.mappingtask;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springboot.mappingtask.data.entity.Student;
import springboot.mappingtask.data.entity.Books;
import springboot.mappingtask.data.repository.StudentRepository;

import java.util.List;

@SpringBootTest
class MappingtaskApplicationTests {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    Student_aRepository student_aRepository;

    @Test

    void relationshipTest(){

        Student studentA = new Student();
        studentA.setName("황형진");
        studentA.setAge("23");
        studentA.setNickname("황황황");
        studentA.setNumber("010-3036-9968");
        studentA.setPassword("2580");

        Student studentB = new Student();
        studentB.setName("박민석");
        studentB.setAge("22");
        studentB.setNickname("박대리");
        studentB.setNumber("010-1234-1234");
        studentB.setPassword("0431");

        studentRepository.save(studentA);
        studentRepository.save(studentB);

        Books class1 = new Books();
        class1.setGroupName("1반");
        class1.getMembers().add(studentA);
        class1.getMembers().add(studentB);

        student_aRepository.save(class1);
        List<Student> members = student_aRepository.findById(1L).get().getMembers();

        for(Student foundStudent : members){
            System.out.println(studentA);
        }
    }
}
