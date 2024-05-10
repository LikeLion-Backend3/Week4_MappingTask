package springboot.mappingtask.data.dao;

import springboot.mappingtask.data.entity.Teacher;

public interface TeacherDAO {
    Teacher insertTeacher(Teacher teacher);

    Teacher selectTeacher(String name) throws  Exception;

    Teacher updateTeacherName(Long pid, String name) throws Exception;

    void deleteTeacher(Long pid) throws Exception;
}
