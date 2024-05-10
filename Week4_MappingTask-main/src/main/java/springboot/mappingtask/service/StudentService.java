package springboot.mappingtask.service;

import springboot.mappingtask.data.dto.request.ChangeNameRequestDto;
import springboot.mappingtask.data.dto.request.RequestStudentDto;
import springboot.mappingtask.data.dto.response.ResponseStudentDto;

public interface StudentService {

    ResponseStudentDto getStudent(String nickname) throws Exception;

    ResponseStudentDto saveStudent(RequestStudentDto requestStudentDto);

    ResponseStudentDto changeStudentName(ChangeNameRequestDto changeNameRequestDto) throws Exception;

    void deleteStudent(String nickname) throws Exception;
}
