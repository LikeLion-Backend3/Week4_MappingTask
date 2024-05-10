package springboot.mappingtask.data.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;

    @Column(nullable = false)
    private String name; //이름

    @Column(nullable = false)
    private String gender; //성별

    @Column(nullable = false)
    private String age; //나이

    @Column(nullable = false, unique = true)
    private String email; //이메일

    @Column(nullable = false, unique = true)
    private String phoneNum; //연락처

    @Column(nullable = false)
    private String subject; //과목

    @Column(nullable = false)
    private Integer grade; //맡은 학년

    @OneToOne(mappedBy = "teacher")
    @ToString.Exclude
    private TeacherDetail teacherDetail;

    @ManyToOne //다대일 매핑
    @JoinColumn(name = "student_id")
    @ToString.Exclude
    private Student student;
}
