package springboot.mappingtask.data.dto.request;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ChangeNameRequestDto {
    private String nickname;
    private String name;

    @Override
    public String toString() {
        return "ChangeNameRequestDto{" +
                "nickname='" + nickname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
