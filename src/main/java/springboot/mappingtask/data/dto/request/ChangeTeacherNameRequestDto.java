package springboot.mappingtask.data.dto.request;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ChangeTeacherNameRequestDto {

    private String name;
    private Long pid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "ChangeTeacherNameRequestDto{" +
                "name='" + name + '\'' +
                ", pid=" + pid +
                '}';
    }



}
