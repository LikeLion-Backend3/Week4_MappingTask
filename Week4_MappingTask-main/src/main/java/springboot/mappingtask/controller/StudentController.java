package springboot.mappingtask.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.mappingtask.data.dto.request.ChangeNameRequestDto;
import springboot.mappingtask.data.dto.request.RequestStudentDto;
import springboot.mappingtask.data.dto.response.ResponseStudentDto;
import springboot.mappingtask.service.StudentService;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/get")
    public ResponseEntity<ResponseStudentDto> getStudent(@RequestParam String nickname) throws Exception {
        ResponseStudentDto responseStudentDto = studentService.getStudent(nickname);

        return ResponseEntity.status(HttpStatus.OK).body(responseStudentDto);
    }

    @PostMapping("/post")
    public ResponseEntity<ResponseStudentDto> createStudent(@RequestBody RequestStudentDto requestStudentDto){
        ResponseStudentDto responseStudentDto = studentService.saveStudent(requestStudentDto);

        return ResponseEntity.status(HttpStatus.OK).body(responseStudentDto);
    }
    @PutMapping("/put")
    public ResponseEntity<ResponseStudentDto> changeStudentName(@RequestBody ChangeNameRequestDto changeNameRequestDto) throws Exception {
        ResponseStudentDto responseStudentDto = studentService.changeStudentName(changeNameRequestDto);

        return ResponseEntity.status(HttpStatus.OK).body(responseStudentDto);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteStudent (String nickname) throws Exception {
        studentService.deleteStudent(nickname);

        return ResponseEntity.status(HttpStatus.OK).body(nickname+"학생이 삭제되었습니다. 삭제되었습니다.");
    }
}
