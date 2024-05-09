package springboot.mappingtask.data.dao;

import springboot.mappingtask.data.entity.Student;

public interface StudentDAO {
    Student insertStudent(Student student);

    Student selectStudent(String nickname) throws Exception;

    Student updateStudentName(String nickname, String name) throws Exception;

    void deleteStudent(String nickname) throws Exception;
}
