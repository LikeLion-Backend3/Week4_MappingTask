package springboot.mappingtask.data.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "student_group")
public class Student_a{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String GroupName;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id")
    private List<Student> members = new ArrayList<>();

}
