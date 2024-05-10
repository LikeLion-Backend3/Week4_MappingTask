package springboot.mappingtask.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.mappingtask.data.dto.request.RequestSchoolDto;
import springboot.mappingtask.data.dto.request.RequestUpdateSchoolDto;
import springboot.mappingtask.data.dto.response.ResponseSchoolDto;
import springboot.mappingtask.service.SchoolService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class SchoolController {
    private final SchoolService schoolService;

    @GetMapping("/school")
    public ResponseEntity<ResponseSchoolDto> getSchool(@RequestParam String name) throws Exception {
        ResponseSchoolDto result = schoolService.getSchool(name);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @PostMapping("/school")
    public ResponseEntity<Long> createSchool(@RequestBody RequestSchoolDto requestSchoolDto) throws Exception {
        Long result = schoolService.createSchool(requestSchoolDto);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @PutMapping("/school")
    public ResponseEntity<ResponseSchoolDto> updateSchool(@RequestBody RequestUpdateSchoolDto requestUpdateSchoolDto) throws Exception {
        ResponseSchoolDto result = schoolService.updateSchool(requestUpdateSchoolDto);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @DeleteMapping("/school")
    public ResponseEntity<Long> deleteSchool(@RequestParam Long id) throws Exception {
        schoolService.deleteSchool(id);
        return ResponseEntity.status(HttpStatus.OK).body(id);
    }

}
