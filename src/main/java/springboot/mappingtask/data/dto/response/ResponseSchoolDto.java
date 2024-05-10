package springboot.mappingtask.data.dto.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class ResponseSchoolDto {
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String type;
}
