package springboot.mappingtask.data.dto.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class RequestSchoolDto {
    private String name;
    private String address;
    private String phone;
    private String type;
}
