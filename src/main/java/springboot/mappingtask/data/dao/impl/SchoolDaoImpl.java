package springboot.mappingtask.data.dao.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import springboot.mappingtask.data.dao.SchoolDao;
import springboot.mappingtask.data.entity.School;
import springboot.mappingtask.data.repository.SchoolRepository;

@Component
@RequiredArgsConstructor
public class SchoolDaoImpl implements SchoolDao {
    private final SchoolRepository schoolRepository;

    @Override
    public Long createSchool(School school) throws Exception {
        Long result = schoolRepository.save(school).getId();
        return result;
    }

    @Override
    public School readSchool(String name) throws Exception {
        School result = schoolRepository.findByName(name);
        return result;
    }

    @Override
    public School updateSchool(Long id, String name) throws Exception {
        School school = schoolRepository.getById(id);
        school.setName(name);
        schoolRepository.save(school);
        return school;
    }

    @Override
    public void deleteSchool(Long id) throws Exception {
        schoolRepository.deleteById(id);
    }
}
