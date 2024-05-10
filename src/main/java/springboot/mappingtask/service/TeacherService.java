package springboot.mappingtask.service;

import springboot.mappingtask.data.dto.request.ChangeTeacherNameRequestDto;
import springboot.mappingtask.data.dto.request.RequestTeacherDto;
import springboot.mappingtask.data.dto.response.ResponseTeacherDto;

public interface TeacherService {

    ResponseTeacherDto getTeacher(String subject) throws  Exception;

    ResponseTeacherDto saveTeacher(RequestTeacherDto responseTeacherDto);

    ResponseTeacherDto changeTeacherName(ChangeTeacherNameRequestDto changeTeacherNameRequestDto) throws Exception;

    void deleteTeacher(Long pid) throws  Exception;
}
