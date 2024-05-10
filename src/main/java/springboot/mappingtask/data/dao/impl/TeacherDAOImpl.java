package springboot.mappingtask.data.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springboot.mappingtask.data.dao.TeacherDAO;
import springboot.mappingtask.data.entity.Teacher;
import springboot.mappingtask.data.repository.TeacherRepository;

import java.util.Optional;


@Component
public class TeacherDAOImpl implements TeacherDAO{

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherDAOImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher insertTeacher(Teacher teacher) {
        Teacher result = teacherRepository.save(teacher);

        return result;
    }

    @Override
    public Teacher selectTeacher(String name) throws Exception {
        Optional<Teacher> teacher = teacherRepository.findByName(name);

        if(teacher.isPresent()) {
            Teacher result = teacher.get();
            return result;
        }else {
            throw new Exception("해당 선생님을 찾을 수 없습니다.");
        }
    }

    @Override
    public Teacher updateTeacherName(Long pid, String name) throws Exception {
        Optional<Teacher> findTeacher = teacherRepository.findByName(name);

        Teacher result;

        if(findTeacher != null) {
            Teacher teacher = findTeacher.get();

            teacher.setName(name);

            result = teacherRepository.save(teacher);
        }else {
            throw new Exception("찾을 수 없음");
        }

        return result;
    }

    @Override
    public void deleteTeacher(Long pid) throws Exception {
        teacherRepository.deleteById(pid);
    }
}
