package springboot.mappingtask.data.dto.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class RequestUpdateSchoolDto {
    private Long id;
    private String name;
}
