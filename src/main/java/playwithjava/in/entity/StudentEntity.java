package playwithjava.in.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder(toBuilder = true)
@Table(name = "student")
@Entity(name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long studentId;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "grade")
    private Long grade;


}
