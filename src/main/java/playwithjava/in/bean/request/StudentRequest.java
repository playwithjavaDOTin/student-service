package playwithjava.in.bean.request;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder(toBuilder = true)
public class StudentRequest {
    private String name;
    private String email;
    private Long grade;

}
