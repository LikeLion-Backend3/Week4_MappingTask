package springboot.mappingtask.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


//일대일 단방향 매핑
@Entity
@Table(name = "table_detail")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class TeacherDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}
