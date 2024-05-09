package springboot.mappingtask.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.mappingtask.data.dao.StudentDAO;
import springboot.mappingtask.data.dto.request.ChangeNameRequestDto;
import springboot.mappingtask.data.dto.request.RequestStudentDto;
import springboot.mappingtask.data.dto.response.ResponseStudentDto;
import springboot.mappingtask.data.entity.Student;
import springboot.mappingtask.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentDAO studentDAO;

    @Autowired
    public StudentServiceImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public ResponseStudentDto getStudent(String nickname) throws Exception {
        Student student = studentDAO.selectStudent(nickname);

        return getResponseStudentDto(student);
    }

    @Override
    public ResponseStudentDto saveStudent(RequestStudentDto requestStudentDto) {
        Student student = new Student();
        student.setName(requestStudentDto.getName());
        student.setAge(requestStudentDto.getAge());
        student.setNickname(requestStudentDto.getNickname());
        student.setNumber(requestStudentDto.getNumber());
        student.setPassword(requestStudentDto.getPassword());

        Student savedStudent = studentDAO.insertStudent(student);

        return getResponseStudentDto(savedStudent);
    }

    @Override
    public ResponseStudentDto changeStudentName(ChangeNameRequestDto changeNameRequestDto) throws Exception {
        Student findStudent = studentDAO.updateStudentName(changeNameRequestDto.getNickname(), changeNameRequestDto.getName());

        return getResponseStudentDto(findStudent);
    }

    //중복되는 코드가 있어서 따로 뺐습니다.
    private ResponseStudentDto getResponseStudentDto(Student student) {
        ResponseStudentDto responseStudentDto = new ResponseStudentDto();
        responseStudentDto.setPid(student.getPid());
        responseStudentDto.setName(student.getName());
        responseStudentDto.setAge(student.getAge());
        responseStudentDto.setNickname(student.getNickname());
        responseStudentDto.setNumber(student.getNumber());
        responseStudentDto.setPassword(student.getPassword());
        return responseStudentDto;
    }

    @Override
    public void deleteStudent(String nickname) throws Exception {
        studentDAO.deleteStudent(nickname);
    }
}
