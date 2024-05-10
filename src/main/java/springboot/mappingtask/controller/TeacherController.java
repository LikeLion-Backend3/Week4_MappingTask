package springboot.mappingtask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.mappingtask.data.dto.request.ChangeTeacherNameRequestDto;
import springboot.mappingtask.data.dto.request.RequestTeacherDto;
import springboot.mappingtask.data.dto.response.ResponseTeacherDto;
import springboot.mappingtask.service.TeacherService;

@RestController
@RequestMapping("/api/v1/teacher")
public class TeacherController {

    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/get")
    public ResponseEntity<ResponseTeacherDto> getTeacher(@RequestParam String subject) throws Exception {
        ResponseTeacherDto responseTeacherDto = teacherService.getTeacher(subject);

        return ResponseEntity.status(HttpStatus.OK).body(responseTeacherDto);
    }

    @PostMapping("/post")
    public ResponseEntity<ResponseTeacherDto> createTeaher(@RequestBody RequestTeacherDto requestTeacherDto){
        ResponseTeacherDto responseTeacherDto = teacherService.saveTeacher(requestTeacherDto);

        return ResponseEntity.status(HttpStatus.OK).body(responseTeacherDto);
    }

    @PutMapping("/put")
    public ResponseEntity<ResponseTeacherDto> changeTeacherName(@RequestBody ChangeTeacherNameRequestDto changeTeacherNameRequestDto) throws Exception{
        ResponseTeacherDto responseTeacherDto = teacherService.changeTeacherName(changeTeacherNameRequestDto);

        return ResponseEntity.status(HttpStatus.OK).body(responseTeacherDto);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteTeacher(Long pid) throws Exception{
       teacherService.deleteTeacher(pid);

        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
    }
}
