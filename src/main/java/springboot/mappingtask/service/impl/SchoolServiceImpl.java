package springboot.mappingtask.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springboot.mappingtask.data.dao.SchoolDao;
import springboot.mappingtask.data.dto.request.RequestSchoolDto;
import springboot.mappingtask.data.dto.response.ResponseSchoolDto;
import springboot.mappingtask.data.dto.request.RequestUpdateSchoolDto;
import springboot.mappingtask.data.entity.School;
import springboot.mappingtask.service.SchoolService;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {
    private final SchoolDao schoolDao;

    @Override
    public ResponseSchoolDto getSchool(String name) throws Exception {
        School school = schoolDao.readSchool(name);
        ResponseSchoolDto result = new ResponseSchoolDto();
        result.setId(school.getId());
        result.setName(school.getName());
        result.setType(school.getType());
        result.setPhone(school.getPhone());
        result.setAddress(school.getAddress());
        return result;
    }

    @Override
    public Long createSchool(RequestSchoolDto requestSchoolDto) throws Exception {
        School school = new School();
        school.setName(requestSchoolDto.getName());
        school.setAddress(requestSchoolDto.getAddress());
        school.setType(requestSchoolDto.getType());
        school.setPhone(requestSchoolDto.getPhone());
        Long result = schoolDao.createSchool(school);
        return result;
    }

    @Override
    public ResponseSchoolDto updateSchool(RequestUpdateSchoolDto requestUpdateSchoolDto) throws Exception {
        School school = schoolDao.updateSchool(requestUpdateSchoolDto.getId(), requestUpdateSchoolDto.getName());
        ResponseSchoolDto result = new ResponseSchoolDto();
        result.setId(school.getId());
        result.setName(school.getName());
        result.setType(school.getType());
        result.setPhone(school.getPhone());
        result.setAddress(school.getAddress());
        return result;
    }

    @Override
    public void deleteSchool(Long id) throws Exception {
        schoolDao.deleteSchool(id);
    }
}
