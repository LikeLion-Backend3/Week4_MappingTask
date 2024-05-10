package springboot.mappingtask.data.dto.request;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ChangeTeacherNameRequestDto {

    private Long pid;
    private String name;

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ChangeTeacherNameRequestDto{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                '}';
    }
}
