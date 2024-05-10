package springboot.mappingtask.data.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title; //교과서 제목

    @Column(nullable = false)
    private String major; //과목

    @Column(nullable = false, unique = true)
    private String page; //쪽수

    @Column(nullable = false)
    private String price; //책가격


}
