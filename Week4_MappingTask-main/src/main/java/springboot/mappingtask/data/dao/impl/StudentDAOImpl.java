package springboot.mappingtask.data.dao.impl;

import org.springframework.stereotype.Component;
import springboot.mappingtask.data.dao.StudentDAO;
import springboot.mappingtask.data.entity.Student;
import springboot.mappingtask.data.repository.StudentRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class StudentDAOImpl implements StudentDAO {

    private final StudentRepository studentRepository;

    public StudentDAOImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student insertStudent(Student student) {
        Student result = studentRepository.save(student);
        return result;
    }

    @Override
    public Student selectStudent(String nickname) throws Exception {
        Optional<Student> student = studentRepository.findByNickname(nickname);

        if (student.isPresent()) {
            Student result = student.get();
            return result;
        } else {
            throw new Exception("해당 닉네임이 없습니다.");
        }
    }

    @Override
    public Student updateStudentName(String nickname, String name) throws Exception {
        Optional<Student> findStudent = studentRepository.findByNickname(nickname);

        Student result;

        if(findStudent != null){
            Student student = findStudent.get();
            student.setName(name);
            result = studentRepository.save(student);
        }else{
            throw new Exception("찾을 수 없음");
        }

        return result;
    }

    @Override
    public void deleteStudent(String nickname) throws Exception {
        Optional<Student> findStudent = studentRepository.findByNickname(nickname);

        if(findStudent != null){
            Student student = findStudent.get();
            studentRepository.delete(student);
        }else{
            throw new Exception("찾을 수 없음");
        }
    }
}
