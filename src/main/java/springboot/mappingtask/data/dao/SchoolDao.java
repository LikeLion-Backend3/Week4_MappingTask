package springboot.mappingtask.data.dao;

import org.springframework.stereotype.Component;
import springboot.mappingtask.data.entity.School;

public interface SchoolDao {
    Long createSchool(School school) throws Exception;
    School readSchool(String name) throws Exception;
    School updateSchool(Long id, String name) throws Exception;
    void deleteSchool(Long id) throws Exception;
}
