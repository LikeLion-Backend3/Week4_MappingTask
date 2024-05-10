package springboot.mappingtask.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.mappingtask.data.dao.TeacherDAO;
import springboot.mappingtask.data.dto.request.ChangeTeacherNameRequestDto;
import springboot.mappingtask.data.dto.request.RequestTeacherDto;
import springboot.mappingtask.data.dto.response.ResponseTeacherDto;
import springboot.mappingtask.data.entity.Teacher;
import springboot.mappingtask.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherDAO teacherDAO;

    @Autowired
    public TeacherServiceImpl(TeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    }

    @Override
    public ResponseTeacherDto getTeacher(String name) throws Exception {
        Teacher teacher = teacherDAO.selectTeacher(name);

        ResponseTeacherDto responseTeacherDto = new ResponseTeacherDto();
        responseTeacherDto.setPid(teacher.getPid());
        responseTeacherDto.setName(teacher.getName());
        responseTeacherDto.setGender(teacher.getGender());
        responseTeacherDto.setAge(teacher.getAge());
        responseTeacherDto.setEmail(teacher.getEmail());
        responseTeacherDto.setPhoneNum(teacher.getPhoneNum());
        responseTeacherDto.setSubject(teacher.getSubject());
        responseTeacherDto.setGrade(teacher.getGrade());

        return responseTeacherDto;
    }

    @Override
    public ResponseTeacherDto saveTeacher(RequestTeacherDto responseTeacherDto) {
        Teacher teacher = new Teacher();
        teacher.setName(responseTeacherDto.getName());
        teacher.setGender(responseTeacherDto.getGender());
        teacher.setAge(responseTeacherDto.getAge());
        teacher.setEmail(responseTeacherDto.getEmail());
        teacher.setPhoneNum(responseTeacherDto.getPhoneNum());
        teacher.setSubject(responseTeacherDto.getSubject());
        teacher.setGrade(responseTeacherDto.getGrade());

        Teacher savedTeacher = teacherDAO.insertTeacher(teacher);

        ResponseTeacherDto responseDto = new ResponseTeacherDto();
        responseDto .setName(savedTeacher.getName());
        responseDto .setGender(savedTeacher.getGender());
        responseDto .setAge(savedTeacher.getAge());
        responseDto .setEmail(savedTeacher.getEmail());
        responseDto .setPhoneNum(savedTeacher.getPhoneNum());
        responseDto .setSubject(savedTeacher.getSubject());
        responseDto .setGrade(savedTeacher.getGrade());

        return responseDto ;
    }

    @Override
    public ResponseTeacherDto changeTeacherName(ChangeTeacherNameRequestDto changeTeacherNameRequestDto) throws Exception {
        Teacher findTeacher = teacherDAO.updateTeacherName(changeTeacherNameRequestDto.getPid(), changeTeacherNameRequestDto.getName());

        ResponseTeacherDto responseTeacherDto = new ResponseTeacherDto();
        responseTeacherDto.setName(findTeacher.getName());
        responseTeacherDto.setGender(findTeacher.getGender());
        responseTeacherDto.setAge(findTeacher.getAge());
        responseTeacherDto.setEmail(findTeacher.getEmail());
        responseTeacherDto.setPhoneNum(findTeacher.getPhoneNum());
        responseTeacherDto.setSubject(findTeacher.getSubject());
        responseTeacherDto.setGrade(findTeacher.getGrade());

        return responseTeacherDto;
    }

    @Override
    public void deleteTeacher(Long pid) throws  Exception {
        teacherDAO.deleteTeacher(pid);
    }
}
