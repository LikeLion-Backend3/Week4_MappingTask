package springboot.mappingtask.service;

import springboot.mappingtask.data.dto.request.RequestSchoolDto;
import springboot.mappingtask.data.dto.response.ResponseSchoolDto;
import springboot.mappingtask.data.dto.request.RequestUpdateSchoolDto;

public interface SchoolService {
    ResponseSchoolDto getSchool(String name) throws Exception;
    Long createSchool(RequestSchoolDto requestSchoolDto) throws Exception;
    ResponseSchoolDto updateSchool(RequestUpdateSchoolDto requestUpdateSchoolDto) throws Exception;
    void deleteSchool(Long id) throws Exception;
}
